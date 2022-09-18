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
public class Layouts {
    JFrame frame=new JFrame();
    JButton be=new JButton("east");
    JButton bs=new JButton("south");
    JButton bw=new JButton("west");
    JButton bn=new JButton("north");
    JButton bc=new JButton("center");
    JButton copy =bn;
    JPanel panel=new JPanel();
    JPanel panel1=new JPanel();
    
    
    public static void main(String[] args) {
        Layouts b=new Layouts();
        b.go();
    }
    public void go()
    {
        frame.setVisible(true);
        frame.setSize(800,800);
        Font f=new Font("Arial",Font.BOLD,18);
        be.setFont(f);
        bw.setFont(f);                                      //whatever comes first has its way
        bn.setFont(f);                                      //if preferred size of be and bw coincide, bw 
        bs.setFont(f);                                      //comes first so it will stay as it is and 
        bc.setFont(f);                                      //overlap-area-of-be will be hidden behind
       // frame.getContentPane().add(BorderLayout.WEST,bw);
        //frame.getContentPane().add(BorderLayout.EAST,be);
       //frame.getContentPane().add(BorderLayout.NORTH,bn);
       //frame.getContentPane().add(BorderLayout.SOUTH,bs);
       // frame.getContentPane().add(BorderLayout.CENTER,bc);
        //frame.getContentPane().add(BorderLayout.EAST,panel);
       // panel.setBackground(Color.black);
       // panel.add(be);
       // panel.add(bn);
       // panel.add(bs);
       // panel.add(be);
        frame.getContentPane().add(BorderLayout.WEST,panel1);
        
        panel1.setBackground(Color.darkGray);
        panel1.add(be);
        panel1.add(bw);
        panel1.add(bs);
        panel1.add(copy);
        panel1.add(be);
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        
        
    }
}
