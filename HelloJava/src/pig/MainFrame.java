package pig;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
    public MainFrame() {
        //设置标题
        this.setTitle("猪吃食物");
        //设置窗体大小
        this.setSize(800,600);
        //定位更居中
        this.setLocationRelativeTo(null);


        //下面注释的两行代码也可以用来控制窗体显示的位置
//        Toolkit tl = Toolkit.getDefaultToolkit();
//        this.setLocation((tl.getScreenSize().width-800)/2, (tl.getScreenSize().height-600)/2);


        //添加默认关闭方法
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //不可改变窗体大小
        this.setResizable(false);
        //使窗体可见
        this.setVisible(true);

        //添加按键监听器                                         //适配器
        this.addKeyListener(new KeyAdapter(){
            //键盘按下
            public void keyPressed(KeyEvent e)//要实现这个方法，方法里面的keyPressed()方法为自己所定义
            {
                MainFrame.this.keyPressed(e);
            }
            //释放按键
            public void keyReleased(KeyEvent e)
            {
                MainFrame.this.keyReleased(e);
            }
        });

        //启动一个线程 20毫秒重画一次
        new Thread(){
            public void run()
            {
                while(true)
                {
                    //repaint();//也可以
                    MainFrame.this.repaint();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();//启动
    }

    //每隔20毫秒被执行一次
    private Image bufferImage = null;
    public void paint(Graphics g)//要实现此方法
    {
        if(bufferImage ==null)
        {
            bufferImage=this.createImage(800,600);
        }
        //先拿到图片的画笔
        Graphics gg = bufferImage.getGraphics();
        gg.setColor(Color.red);
        gg.fillRect(0, 0, 800, 600);

        this.draw(gg);//调用自定义画图方法

        g.drawImage(bufferImage,0,0,null);
    }

    private int pigX=350;
    private int pigY=250;

    public void draw(Graphics g)
    {
        //画四个角的四个坑，猪的槽槽
        g.setColor(Color.WHITE);//猪槽是白色
        //g.fillRect(x, y, width, height);
        g.fillRect(0, 25, 60, 60);
        g.fillRect(740, 25, 60, 60);
        g.fillRect(0, 540, 60, 60);
        g.fillRect(740, 540, 60, 60);

        //画猪
        g.setColor(Color.WHITE);//画猪，颜色为白色
        g.fillOval(pigX, pigY, 50, 50);//猪开始的坐标为(350,250),宽和高为50，即是一个圆
        g.setColor(Color.BLACK);//圆圈里面为黑色
        g.setFont(new Font("隶书",Font.BOLD,30));
        g.drawString("猪", pigX+10, pigY+35);//字 猪在圆圈里面
        //调用移动move();
        this.move();

    }
    //设置四个布尔变量：上下左右方向键。组合起来有八种方向
    private boolean isUp = false;
    private boolean isDown=false;
    private boolean isLeft=false;
    private boolean isRight=false;

    //自定义移动猪的位置
    private void move()
    {
        if(isUp  && !isDown && !isLeft && !isRight)
        {
            //上
            pigY-=5;
        }
        else if(!isUp && isDown && !isLeft & !isRight)
        {
            //下
            pigY+=5;
        }
        else if(!isUp && !isDown && isLeft && !isRight)
        {
            //坐
            pigX-=5;
        }
        else if(!isUp && !isDown && !isLeft && isRight)
        {
            //右，
            pigX+=5;
        }
        else if(isUp && !isDown && isLeft && !isRight)
        {
            //左上
            pigX-=5;
            pigY-=5;
        }
        else if(!isUp && isDown && isLeft && !isRight)
        {
            //左下
            pigX-=5;
            pigY+=5;
        }
        else if(isUp && !isDown && !isLeft && isRight)
        {
            //右上
            pigX+=5;
            pigY-=5;
        }
        else if(!isUp && isDown && !isLeft && isRight)
        {
            //右下
            pigX+=5;
            pigY+=5;
        }
    }
    //按下键时，获取按下的键的值，找出对应的键，然后使其变为真true
    public void keyPressed(KeyEvent e)
    {
        int keyCode=e.getKeyCode();//获取对应键的值
        if(keyCode == KeyEvent.VK_UP ||keyCode ==KeyEvent.VK_W)
        {
            //上
            isUp=true;
        }
        else if(keyCode ==KeyEvent.VK_DOWN || keyCode ==KeyEvent.VK_S)
        {
            //下
            isDown=true;
        }
        else if(keyCode == KeyEvent.VK_LEFT || keyCode ==KeyEvent.VK_A)
        {
            //左
            isLeft=true;
        }
        else if(keyCode == KeyEvent.VK_RIGHT || keyCode ==KeyEvent.VK_D)
        {
            //右
            isRight=true;
        }
    }
    //释放，释放了那个键就使对应键设为false
    public void keyReleased(KeyEvent e)
    {
        int keyCode=e.getKeyCode();//获取对应键的值
        if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W)
        {
            isUp = false;
        }
        else if(keyCode ==KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S)
        {
            isDown=false;
        }
        else if(keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A)
        {
            isLeft=false;
        }
        else if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D)
        {
            isRight=false;
        }
    }
}