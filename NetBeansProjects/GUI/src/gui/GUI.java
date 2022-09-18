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
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
public class GUI implements ActionListener{

    static JFrame frame=new JFrame();
    static JButton b1=new JButton("Click me");
    static JButton b2=new JButton("Hit me");
    static MyPanel p=new MyPanel();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         frame.setSize(500,500);
         
         b1.setSize(5,5);
         b2.setSize(40,40);
         frame.getContentPane().add(BorderLayout.SOUTH,b1);
         frame.getContentPane().add(BorderLayout.NORTH,b2);
         GUI g=new GUI();
         b1.addActionListener(g);
         b2.addActionListener(g);
         frame.getContentPane().add(p);
         frame.setVisible(true);
         
         
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(((JButton)e.getSource()).equals(b1))
        {
            b1.setText("Clicked");
            p.repaint();
        }
        else
            b2.setText("Hit");
    }
    
    
}
