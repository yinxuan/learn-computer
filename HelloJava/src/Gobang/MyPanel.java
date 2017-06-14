package Gobang;

import javax.swing.*;
import java.awt.*;

/**
 * Created by s on 2017/6/14.
 */
public class MyPanel extends Panel{
    public MyPanel() {

        JButton jbn = new JButton("Test");
        this.add(jbn);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //矩形的绘制
        g.setColor(Color.blue);
        g.drawRect(100,100,100,100);
        g.fillRect(150,130,50,80);

        //椭圆的绘制
        g.setColor(Color.red);
        g.drawOval(200,100,30,30);
        g.fillOval(250,250,30,30);

        //线条的绘制
        g.setColor(Color.green);
        for(int i =0;i < 20;i++) {
            g.drawLine(10,10*i+10,400,10*i+10);
        }
    }

//    @Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g);
//    }
}
