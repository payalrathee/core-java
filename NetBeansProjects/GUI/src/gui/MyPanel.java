/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author vishal
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g)
    {
        Random r=new Random();
        Color c1=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        Color c2=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getHeight(), this.getWidth());
        Graphics2D g2D=(Graphics2D)g;
        GradientPaint gr=new GradientPaint(90,90,c1,150,150,c2);
       // g.setColor(Color.GRAY);
        g2D.setPaint(gr);
        g2D.fillOval(70, 70, 100,100);
       // Image i=new ImageIcon("download(1).jpg").getImage();
        //g.drawImage(i, 3, 4, this);
    }
}
