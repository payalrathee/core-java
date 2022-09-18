/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.swing;

/**
 *
 * @author vishal
 */
import javax.swing.*;
import java.awt.*;
public class BoLay {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    
    public static void main(String[] args) {
        BoLay b=new BoLay();
        b.go();
    }
    
    public void go()
    {
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.getContentPane().add(BorderLayout.EAST,panel);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(b1);
        panel.add(b2);
        panel.setBackground(Color.black);
    }
}
