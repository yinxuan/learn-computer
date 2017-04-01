package pig;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame2 extends JFrame{
    private Image siRen = null;
    public MainFrame2() {
        try {
            //siRen=ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("images/anbei.jpg"));
            siRen=ImageIO.read(MainFrame2.class.getClassLoader().getResourceAsStream("images/anbei.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //设置标题
        this.setTitle("祭祀安倍晋三");
        //设置窗体大小
        this.setSize(800,600);
        //定位居中
        this.setLocationRelativeTo(null);
        //设置不能随便改变窗体大小
        this.setResizable(false);
        //设置默认关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可见
        this.setVisible(true);

        //启动线程
        new Thread(){
            @Override
            public void run() {
                while(true){
                    MainFrame2.this.repaint();//重画
                    try {
                        Thread.sleep(250);//休眠250毫秒再次运行代码（重画图形）
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }.start();
    }
    //每隔 20 毫秒被执行一次
    private Image bufferImage=null;

    @Override
    public void paint(Graphics g)
    {
        if(bufferImage==null)//只创建一次
        {
            bufferImage =this.createImage(800, 600);

        }
        //先拿到图片的画笔
        Graphics gForImage = bufferImage.getGraphics();
        gForImage.setColor(Color.BLACK);//设置背景黑色
        gForImage.fillRect(0, 0, 800, 600);//窗体全部填充

        gForImage.setColor(Color.GREEN);//设置字体绿色
        gForImage.setFont(new Font("楷书",Font.BOLD,40));//设置字体、字形、大小
        gForImage.drawString("祭奠"+(int)(Math.random()*10), 320, 200);//画出汉字再加上随机数
        //画死人                                               x   y
        gForImage.drawImage(siRen, 280, 220, null);

        g.drawImage(bufferImage, 0, 0,null);//很重要
    }
}