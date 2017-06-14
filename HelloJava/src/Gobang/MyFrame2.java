package Gobang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by s on 2017/6/14.
 * 五子棋   尹炫 yinxuansh@126.com
 * 优化菜单栏
 */
public class MyFrame2 extends JFrame{
    public MyFrame2(){
        this.setTitle("测试窗口");
        this.setSize(500,400);

        //居中对齐
        int width= Toolkit.getDefaultToolkit().getScreenSize().width;
        int heigth= Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setLocation((width-500)/2,(heigth-400)/2);

        //菜单
        //菜单栏   javax.swing.JMenuBar
        //菜单根目录     javax.swing.JMenu
        //菜单项        javax.swing.JMenuItem

        //第一步，菜单栏
        JMenuBar bar = new JMenuBar();      //创建一个菜单栏
        //把菜单栏添加到窗体
        this.setJMenuBar(bar);

        //第二步：添加菜单根目录(菜单)
        //创建菜单
        JMenu menu1 = new JMenu("文件");
        JMenu menu2 = new JMenu("编辑");
        JMenu menu3 = new JMenu("游戏");
        JMenu menu4 = new JMenu("Refactor");

        //把菜单添加到菜单栏
        bar.add(this.makeMune(menu1,new String[]{"新建","打开文件",null,"关闭","关闭所有",null,"test5"}));
        bar.add(this.makeMune(menu2,new String[]{"test1","test2",null,"test3","test4",null,"test5"}));
        bar.add(this.makeMune(menu3,new String[]{"模式"}));
        bar.add(this.makeMune(menu4,new String[]{"test1","test2",null,"test3","test4",null,"test5"}));

        //添加panel
        Container con = this.getContentPane();
        con.add(new MyPanel());

    }

    //菜单项优化的方法
    public JMenu makeMune(JMenu m,String[] items) {
        for(int i = 0;i < items.length;i++) {
            if(items[i] == null) {
                m.addSeparator();
            }else if(items[i].equals("模式")){
                JMenu m1 = new JMenu("模式");

                JRadioButtonMenuItem i1 = new JRadioButtonMenuItem("人机对弈");
                JRadioButtonMenuItem i2 = new JRadioButtonMenuItem("人人对弈");

                i2.setSelected(true);

                ButtonGroup group = new ButtonGroup();
                group.add(i1);
                group.add(i2);

                m1.add(i1);
                m1.add(i2);

                i1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(MyFrame2.this,"=========");
                    }
                });

                m.add(m1);
            } else {
                JMenuItem item = new JMenuItem(items[i]);
                m.add(item);
            }
        }
        return m;
    }

    public static void main(String []args) {
        MyFrame2 mf2 = new MyFrame2();
        mf2.setVisible(true);
        mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
