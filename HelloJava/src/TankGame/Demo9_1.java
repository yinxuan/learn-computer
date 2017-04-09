//package TankGame;
//
//import javax.swing.*;
//import java.awt.*;
//
///**
// * Created by s on 2017/4/6.
// */
//public class Demo9_1 {
//    MyPanel mp = null;
//    public static void main(String[] args) {
//        Demo9_1 demo9_1 = new Demo9_1();
//        System.out.println(demo9_1);
//    }
//
//    public Demo9_1() {
//        mp = new MyPanel();
//        this.add(mp);
//        this.setSize(400,300);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
//    }
//}
//
//
//class MyPanel extends JPanel {
//    //绘图类，类似画笔
//    public void paint(Graphics g) {
//
//        //调用父类完成初始化，这句话不能少！
//        super.paint(g);
//        //画一个圆圈
//        g.drawOval(10,10,30,30);
//    }
//}
//
