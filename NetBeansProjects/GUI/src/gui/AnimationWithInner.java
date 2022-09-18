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
public class AnimationWithInner implements ActionListener {
    
    //class variables
    static JFrame frame=new JFrame();
    static JButton b=new JButton("Click");
    MyPanel p=new MyPanel();
    
    //instance variable
    int x=50;
    int y=50;
    
    //main method
    public static void main(String[] args) {
        AnimationWithInner a=new AnimationWithInner();
        a.go();
       
    }
    public void go()
    {
        frame.setSize(500,500);
        frame.getContentPane().add(BorderLayout.SOUTH,b);
        
        frame.getContentPane().add(BorderLayout.CENTER,p);
        b.addActionListener(this);
        
        frame.setVisible(true);
    }
    public void animate()
    {
        for(int i=0;i<100;i++)
        {
            p.repaint();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0;i<50;i++)
        {    
            p.repaint();
            
        }
    }
    
    private void setxy()
    {
        x++;y++;
    }
   
     //inner class
    public class MyPanel extends JPanel
    {
     @Override   
     public void paintComponent(Graphics g)
     {
         Graphics2D g2D=(Graphics2D)g;
         Random r=new Random();
         Color c1=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
         Color c2=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
         GradientPaint gr=new GradientPaint(x+10,y+10,c1,x+90,y+90,c2);
         g2D.setPaint(gr);
         g2D.fillOval(x,y,100,100);
         setxy();
     }
    }
}
