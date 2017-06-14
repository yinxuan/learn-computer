package Gobang;

import oracle.jvm.hotspot.jfr.JFR;

import javax.swing.*;
import java.awt.*;

/**
 * Created by s on 2017/6/14.
 */
public class MyFrame extends JFrame{
    public  MyFrame() {

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
        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);
        bar.add(menu4);

        //第三步：菜单项的创建
        JMenuItem item1 =new JMenuItem("新建文件");
        JMenuItem item2 =new JMenuItem("打开文件");
        JMenuItem item3 =new JMenuItem("关闭文件");
        JMenuItem item4 =new JMenuItem("关闭所有");

        menu1.add(item1);
        menu1.add(item2);
        menu1.addSeparator();           //分割线
        menu1.add(item3);
        menu1.add(item4);

        //在menu3中t添加一个子菜单，模式
        //JMenuItem item = new JMenuItem("模式");
        //如果菜单项还有子菜单项，则菜单项要提升一层，变成菜单JMenu
        //单选按钮：radio（收音机）

        JMenu m = new JMenu("模式");
//        JMenuItem i1 = new JMenuItem("人机对弈");
//        JMenuItem i2 = new JMenuItem("人人对弈");

        JRadioButtonMenuItem i1 = new JRadioButtonMenuItem("人机对弈");
        JRadioButtonMenuItem i2 = new JRadioButtonMenuItem("人人对弈");
        i2.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(i1);
        bg.add(i2);

        m.add(i1);
        m.add(i2);

        menu3.add(m);
    }
}
