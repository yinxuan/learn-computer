package Gomoku;

import java.awt.Toolkit;

import javax.swing.JFrame;


public class GomokuFrame extends JFrame
{
    //定义一个操作面板
    OperatorPane op=null;

    public GomokuFrame()
    {
        //设置名称
        this.setTitle("五子棋");
        //设置窗口大小
        this.setSize(510,510);
        //设置窗口位置
        //取得电脑屏幕大小
        int computer_width=Toolkit.getDefaultToolkit().getScreenSize().width;
        int computer_height=Toolkit.getDefaultToolkit().getScreenSize().height;
        System.out.println("电脑屏幕的宽度：\n"+computer_width+"\n电脑屏幕的高度：\n"+computer_height);
        //居中
        this.setLocation((computer_width-510)/2, (computer_height-510)/2);

        //实例化幕布
        op=new OperatorPane();
        //导入幕布
        this.add(op);
        //添加鼠标监听
        this.addMouseListener(op);

        //设置窗口的显示
        this.setVisible(true);
        //设置窗口的正常关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //执行测试
    public static void main(String[] args)
    {
        new GomokuFrame();
    }

}
