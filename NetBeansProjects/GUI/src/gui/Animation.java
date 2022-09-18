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
import java.awt.event.*;
import java.util.*;
public class Animation {
    
    JFrame frame=new JFrame();
    MyPanel panel=new MyPanel();
    
    int x=1;
    int y=400;
    
    //main method
    public static void main(String[] args) {
        Animation a=new Animation();
        a.go();
    }
    
    public void go()
    {
       frame.setSize(500,500);
       frame.setVisible(true);
       frame.getContentPane().add(BorderLayout.CENTER,panel);
       
       for(int i=0;i<400;i++)
       {
           y--;
           panel.repaint();
           try
           {Thread.sleep(5);}
               catch(Exception e){}
       }
        for(int i=0;i<150;i++)
       {
           x++;
           panel.repaint();
           try
           {Thread.sleep(5);}
               catch(Exception e){}
       }
         for(int i=0;i<200;i++)
       {
           y++;
           panel.repaint();
           try
           {Thread.sleep(5);}
               catch(Exception e){}
       }
          for(int i=0;i<150;i++)
       {
           x--;
           panel.repaint();
           try
           {Thread.sleep(5);}
               catch(Exception e){}
       }
          x+=150;
           for(int i=0;i<200;i++)
       {
           y++;
           panel.repaint();
           try
           {Thread.sleep(5);}
               catch(Exception e){}
       }
            for(int i=0;i<150;i++)
       {
           x--;
           panel.repaint();
           try
           {Thread.sleep(5);}
               catch(Exception e){}
       }
          
    }
    
    //inner class
   class MyPanel extends JPanel
   {
       @Override
       public void paintComponent(Graphics g)
       {
           Graphics2D g2D=(Graphics2D)g;
           Random r=new Random();
           Color c1=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
           Color c2=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
           GradientPaint gr=new GradientPaint(x+10,y+10,c1,x+90,y+90,c2);
           g2D.setColor(Color.black);
           g2D.fillRect(0, 0, this.getWidth(), this.getHeight());
           g2D.setPaint(gr);
           g2D.fillOval(x,y,100,100);
       }
   }
}
