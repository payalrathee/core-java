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
import javax.sound.midi.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class SoundAndGraphics implements ControllerEventListener {
    
    MyPanel panel ;
    JFrame frame=new JFrame();
    boolean isTrue=false;
    //main method
    public static void main(String[] args) {
        SoundAndGraphics sg=new SoundAndGraphics();
        sg.go();
      }
    
         @Override
    public void controlChange(ShortMessage e)
    {
        isTrue=true;
        panel.repaint();
    }
    
    public void setUpGui()
    {
     frame.setBounds(30,30,300,300);
     panel=new MyPanel();
     frame.setContentPane(panel);
     frame.setVisible(true);
    }
   
    public void go()
    {
        setUpGui();
       try
       {
           Sequencer player =MidiSystem.getSequencer();
           player.open();
           Sequence seq=new Sequence(Sequence.PPQ,4);
           Track track =seq.createTrack();
          int k=0;
           for(int i=0;i<128;i++)
           {
              track.add(makeEvent(144,1,i,50,k)); 
              track.add(makeEvent(176,1,127,0,k));
              track.add(makeEvent(128,1,i,0,k++));
           }
           int[] n={127};
           player.addControllerEventListener(this,n);
           player.setSequence(seq);
           player.start();
          // player.setTempoInBPM(120);
           
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }
    
    public MidiEvent makeEvent(int eventType,int instr,int beat,int vel, int time)
    {
        MidiEvent ev=null;
        try{
        ShortMessage s=new ShortMessage();
        s.setMessage(eventType,instr,beat,vel);
         ev=new MidiEvent(s,time);
         }
        catch(Exception ex){}
        return ev;
    }
    
    
    
    //inner class
    public class MyPanel extends JPanel 
    {
   
    
        
        @Override
        public void paintComponent(Graphics g)
        {
            if(isTrue){
            Random r=new Random();
            int x=r.nextInt(120);
            int y=r.nextInt(120);
            Graphics2D g2D=(Graphics2D)g;
            Color c1=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
            Color c2=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
            GradientPaint gr=new GradientPaint(x+5,y+5,c1,x+10,y+10,c2);
            g2D.setPaint(gr);
            g2D.fillRect(x+10, y+10, r.nextInt(40)+10, r.nextInt(40)+10);
            isTrue=false;
        }
        }
    }
    
}
