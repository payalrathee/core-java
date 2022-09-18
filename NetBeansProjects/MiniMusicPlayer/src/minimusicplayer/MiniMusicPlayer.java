/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimusicplayer;
import javax.sound.midi.*;
/**
 *
 * @author vishal
 *          
 */
public class MiniMusicPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiniMusicPlayer m=new MiniMusicPlayer();
        m.play();
        
    }
    
    public void play()
    {
        
       try
       {
           Sequencer player=MidiSystem.getSequencer();
           player.open();
           
           Sequence seq=new Sequence(Sequence.PPQ,4);
           Track track=seq.createTrack();
           
          /*ShortMessage[] a=new ShortMessage[128];
           ShortMessage[] b=new ShortMessage[128];*/
           MidiEvent[] eon=new MidiEvent[128];
           MidiEvent[] eoff=new MidiEvent[128];
           ShortMessage s=new ShortMessage();
           
           int j=0;
           for(int i=0;i<128;i++)
           {
               s=new ShortMessage();
               s.setMessage(144,10,i,100);
               eon[i]=new MidiEvent(s,j);
               track.add(eon[i]);
               
               s=new ShortMessage();
               s.setMessage(128,10,i,100);
               eoff[i]=new MidiEvent(s,j+=5);
               track.add(eoff[i]);
               
               
           }
           
           
           
           
           /*ShortMessage a=new ShortMessage();
           a.setMessage(144,3,0,100);
           MidiEvent e1on=new MidiEvent(a,1);
            track.add(e1on);
           
           ShortMessage b=new ShortMessage();
           b.setMessage(128,3,0,100);
           MidiEvent e1off=new MidiEvent(b,3);
           track.add(e1off);
           
           ShortMessage c=new ShortMessage();
           b.setMessage(128,3,2,100);
           MidiEvent e2on=new MidiEvent(c,4);
           track.add(e2on);
           
           ShortMessage d=new ShortMessage();
           b.setMessage(128,3,2,100);
           MidiEvent e2off=new MidiEvent(d,6);
           track.add(e2off);*/
           
          
           
           
           player.setSequence(seq);
           player.start();
           
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
}
