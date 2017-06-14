package Gomoku;
/**
 * 实现一个简单的五子棋
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OperatorPane extends JPanel implements MouseListener,Runnable
{
    //定义背景图片对象
    Image imageBackground = null;
    //定义棋盘的格子的行数
    int boardrows=18;
    //定义棋盘的格子的列数
    int boardcols=18;
    //定义棋盘的格子的大小
    int boardsize=20;
    //保存棋子坐标
    int x=0,y=0;
    //保存之前下过的全部棋子坐标
    // 其中数据内容 0： 表示这个点并没有棋子， 1： 表示这个点是黑子， 2：表示这个点是白子
    int allchess[][]=new int [19][19];
    //标记下一步下黑棋还是白棋
    boolean isBlack=true;
    //判断游戏是否能够继续
    boolean canPlay=true;
    //保存显示信息
    String message="黑方先行";
    // 保存最多拥有多少时间(秒)
    int maxTime = 0;
    // 做倒计时的线程类
    Thread t = new Thread(this);
    // 保存黑方与白方的剩余时间
    int blackTime = 0;
    int whiteTime = 0;
    // 保存双方剩余时间的显示信息
    String blackMessage = "无限制";
    String whiteMessage = "无限制";


    @SuppressWarnings("deprecation")
    public OperatorPane()
    {

        t.start();
        t.suspend();

        imageBackground=new ImageIcon("image/background.jpg").getImage();
    }

    public void paint(Graphics g)
    {
        //双缓冲技术
        BufferedImage b1=new BufferedImage(495,475,BufferedImage.TYPE_INT_ARGB);
        Graphics g2=b1.createGraphics();

        // 画出背景图片
        g2.drawImage(imageBackground, 0, 0,495,475,null);


        //画出棋盘线
        Color c=g2.getColor();
        g2.setColor(Color.BLACK);
        for(int i=0;i<=boardrows;i++)
        {
            g2.drawLine(10,50+boardsize*i,10+boardsize*boardrows,50+boardsize*i);
        }
        for(int i=0;i<=boardcols;i++)
        {
            g2.drawLine(10+boardsize*i,50,10+boardsize*i,50+boardsize*boardcols);
        }

        //画出三三位置
        g2.fillOval(67, 107, 6, 6);
        g2.fillOval(67, 347, 6, 6);
        g2.fillOval(307, 107, 6, 6);
        g2.fillOval(307, 347, 6, 6);
        //画出附点
        g2.fillOval(67, 227, 6, 6);
        g2.fillOval(307, 227, 6, 6);
        g2.fillOval(187, 107, 6, 6);
        g2.fillOval(187, 347, 6, 6);

        //画出天元
        g2.fillOval(187, 227, 6, 6);




        //画出文字提示
    /*Font f=new Font("黑体", Font.BOLD, 24);
    g.setFont(f);*/
        g2.setFont(new Font("黑体", Font.BOLD, 20));
        g2.setColor(Color.BLACK);
        g2.drawString("游戏信息："+message, 130, 40);
        g2.setFont(new Font("宋体", Font.ITALIC, 15));
        g2.drawString("黑方时间："+blackMessage,25, 445);
        g2.drawString("白方时间："+whiteMessage,245, 445);

        //绘制全部棋子
        for(int i=0;i<=boardrows;i++)
        {
            for(int j=0;j<=boardcols;j++)
            {
                //存储黑棋
                if(allchess[i][j]==1)
                {
                    int tempX=i*20-10;
                    int tempY=j*20+30;
                    //画出黑棋
                    g2.setColor(Color.BLACK);
                    g2.fillOval(tempX+12, tempY+13, 15, 15);
                }

                //存储白棋
                if(allchess[i][j]==2)
                {
                    int tempX=i*20-10;
                    int tempY=j*20+30;
                    //画出白棋
                    g2.setColor(Color.BLACK);
                    g2.drawOval(tempX+12, tempY+13, 15, 15);
                    g2.setColor(Color.WHITE);
                    g2.fillOval(tempX+12, tempY+13, 15, 15);
                }
            }

        }

        g2.setColor(c);

        g.drawImage(b1,0,0,this);
    }


    private boolean checkWin()
    {
        boolean flag=false;

        int color = allchess[x][y];

        int count;
        //横向判断
        count=this.checkCount(1, 0, color);
        if(count>=5)
        {
            flag = true;
        }
        else
        {
            //纵向判断
            count=this.checkCount(0, 1, color);
            if(count>=5)
            {
                flag = true;
            }
            else
            {
                //斜向“/”
                count=this.checkCount(1, 1, color);
                if(count>=5)
                {
                    flag = true;
                }
                else
                {
                    //斜向“\”
                    count=this.checkCount(1, -1, color);
                    if(count>=5)
                    {
                        flag = true;
                    }
                }
            }
        }



        return flag;
    }

    private int checkCount(int xChange,int yChange,int color)
    {
        int count=1;
        int tempX=xChange;
        int tempY=yChange;

        while (color==allchess[x+xChange][y+yChange])
        {
            count++;
            if(xChange!=0)
            {
                xChange++;
            }
            if(yChange!=0)
            {
                if(yChange<0)
                {
                    yChange--;
                }
                else
                {
                    yChange++;
                }

            }

        }
        //复位
        xChange=tempX;
        yChange=tempY;
        while (color==allchess[x-xChange][y-yChange])
        {
            count++;
            if(xChange!=0)
            {
                xChange++;
            }
            if(yChange!=0)
            {
                if(yChange<0)
                {
                    yChange--;
                }
                else
                {
                    yChange++;
                }
            }
        }
        return count;

    }





    public void mouseClicked(MouseEvent e)
    {

        System.out.println("x:"+e.getX()+"y:"+e.getY());
        x=e.getX();
        y=e.getY();
        if(x>=10&&x<=(10+boardsize*boardrows+20)&&y>=50&&y<=(50+boardsize*boardcols+40))
        {
            //System.out.println("点在棋盘内。");
            x=(x-10)/20;
            y=(y-50-20)/20;


            if(canPlay==true)
            {
                //判断当前要下什么颜色
                if(allchess[x][y]==0)
                {
                    if(isBlack==true)
                    {
                        allchess[x][y]=1;
                        isBlack=false;
                        message="轮到白方";
                    }
                    else
                    {
                        allchess[x][y]=2;
                        isBlack=true;
                        message="轮到黑方";
                    }

                    // 判断这个棋子是否和其他的棋子连成5连，即判断游戏是否结束
                    boolean winFlag=this.checkWin();
                    if(winFlag==true)
                    {

                        JOptionPane.showMessageDialog(this,"游戏结束！"+
                                (allchess[x][y]==1?"黑方":"白方")+"获胜。");
                        canPlay=false;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"当前位置已经有棋子，请重新落子！");
                }
            }
            this.repaint();
        }


        //点击，游戏开始按钮
        //重新开始新的游戏
        if(e.getX()>=400&&e.getX()<=470&&e.getY()>=80&&e.getY()<=110)
        {
            int result=JOptionPane.showConfirmDialog(this, "设置完成,是否重新开始游戏?");
            if(result==0)
            {
                //重新开始的操作，allchess[][]数组中的信息全部为0
                //清空棋盘
                for (int i = 0; i < 19; i++)
                {
                    for (int j = 0; j < 19; j++)
                    {
                        allchess[i][j] = 0;
                    }
                }
                //另一种方式 allChess = new int[19][19];
                blackTime = maxTime;
                whiteTime = maxTime;
                if (maxTime > 0)
                {
                    blackMessage = maxTime / 3600 + ":"
                            + (maxTime / 60 - maxTime / 3600 * 60) + ":"
                            + (maxTime - maxTime / 60 * 60);
                    whiteMessage = maxTime / 3600 + ":"
                            + (maxTime / 60 - maxTime / 3600 * 60) + ":"
                            + (maxTime - maxTime / 60 * 60);
                    t.resume();
                }
                else
                {
                    blackMessage = "无限制";
                    whiteMessage = "无限制";
                }
                message = "黑方先行";
                isBlack = true;
                this.canPlay = true;
                this.repaint();
            }
        }

        //点击 游戏设置按钮
        if(e.getX()>=400&&e.getX()<=470&&e.getY()>=130&&e.getY()<=160)
        {
            String input = JOptionPane
                    .showInputDialog("请输入游戏的最大时间(单位:分钟),如果输入0,表示没有时间限制:");
            try {
                maxTime = Integer.parseInt(input) * 60;
                if (maxTime < 0)
                {
                    JOptionPane.showMessageDialog(this, "请输入正确信息,不允许输入负数!");
                }
                if (maxTime == 0)
                {
                    int result = JOptionPane.showConfirmDialog(this,
                            "设置完成,是否重新开始游戏?");
                    if (result == 0)
                    {
                        for (int i = 0; i < 19; i++)
                        {
                            for (int j = 0; j < 19; j++)
                            {
                                allchess[i][j] = 0;
                            }
                        }
                        // 另一种方式 allChess = new int[19][19];
                        message = "黑方先行";
                        isBlack = true;
                        blackTime = maxTime;
                        whiteTime = maxTime;
                        blackMessage = "无限制";
                        whiteMessage = "无限制";
                        this.canPlay = true;
                        this.repaint();
                    }
                }
                if (maxTime > 0)
                {
                    int result = JOptionPane.showConfirmDialog(this,
                            "设置完成,是否重新开始游戏?");
                    if (result == 0)
                    {
                        for (int i = 0; i < 19; i++)
                        {
                            for (int j = 0; j < 19; j++)
                            {
                                allchess[i][j] = 0;
                            }
                        }
                        // 另一种方式 allChess = new int[19][19];
                        message = "黑方先行";
                        isBlack = true;
                        blackTime = maxTime;
                        whiteTime = maxTime;
                        blackMessage = maxTime / 3600 + ":"
                                + (maxTime / 60 - maxTime / 3600 * 60) + ":"
                                + (maxTime - maxTime / 60 * 60);
                        whiteMessage = maxTime / 3600 + ":"
                                + (maxTime / 60 - maxTime / 3600 * 60) + ":"
                                + (maxTime - maxTime / 60 * 60);
                        t.resume();
                        this.canPlay = true;
                        this.repaint();
                    }
                }
            }
            catch (NumberFormatException e1)
            {
                // TODO Auto-generated catch block
                JOptionPane.showMessageDialog(this, "请正确输入信息!");
            }
        }

        //点击 游戏说明按钮
        if(e.getX()>=400&&e.getX()<=470&&e.getY()>=180&&e.getY()<=210)
        {
            JOptionPane.showMessageDialog(this,"这个一个五子棋游戏程序，黑白双方轮流下棋，当某一方连到五子时，游戏结束。");
        }

        //点击 认输按钮
        if(e.getX()>=400&&e.getX()<=470&&e.getY()>=280&&e.getY()<=310)
        {
            int result=JOptionPane.showConfirmDialog(this,"是否确定认输？");
            if (result == 0)
            {
                if (isBlack)
                {
                    JOptionPane.showMessageDialog(this, "黑方已经认输,游戏结束!");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "白方已经认输,游戏结束!");
                }
                canPlay = false;
            }
        }

        //点击 关于按钮
        if(e.getX()>=400&&e.getX()<=470&&e.getY()>=330&&e.getY()<=360)
        {
            JOptionPane.showMessageDialog(this,"本游戏由南木工作室制作，有相关问题可以访问www.yiyiinformation.com");
        }

        //点击 退出按钮
        if(e.getX()>=400&&e.getX()<=470&&e.getY()>=380&&e.getY()<=410)
        {
            JOptionPane.showMessageDialog(this, "游戏结束");
            System.exit(0);
        }

    }



    //************************//
    @Override
    public void mouseEntered(MouseEvent arg0)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent arg0)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent arg0)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void run()
    {
        if (maxTime > 0)
        {
            while (true)
            {
                if (isBlack)
                {
                    blackTime--;
                    if (blackTime == 0)
                    {
                        JOptionPane.showMessageDialog(this, "黑方超时,游戏结束!");
                    }
                }
                else
                {
                    whiteTime--;
                    if (whiteTime == 0)
                    {
                        JOptionPane.showMessageDialog(this, "白方超时,游戏结束!");
                    }
                }
                blackMessage = blackTime / 3600 + ":"
                        + (blackTime / 60 - blackTime / 3600 * 60) + ":"
                        + (blackTime - blackTime / 60 * 60);
                whiteMessage = whiteTime / 3600 + ":"
                        + (whiteTime / 60 - whiteTime / 3600 * 60) + ":"
                        + (whiteTime - whiteTime / 60 * 60);
                this.repaint();
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(blackTime + " -- " + whiteTime);
            }
        }
    }

}
