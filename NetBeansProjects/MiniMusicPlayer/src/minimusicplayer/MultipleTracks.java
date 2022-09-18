/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimusicplayer;

/**
 *
 * @author vishal
 */
import javax.sound.midi.*;
public class MultipleTracks {
    public static void main(String[] args) {
        try
        {
            Sequencer player=MidiSystem.getSequencer();
            player.open();
            Sequence seq=new Sequence(Sequence.PPQ,4);
            
            Track[] track=new Track[128];
            ShortMessage s=new ShortMessage();
            MidiEvent[][] eon=new MidiEvent[128][128];
            MidiEvent[][] eoff=new MidiEvent[128][128];
            
            for(int i=0;i<1;i++)
            {
                track[i]=seq.createTrack();
                int k=0;
                for(int j=0;j<128;j++)
                {
                    s.setMessage(144,i,j,50);
                    eon[i][j]=new MidiEvent(s,k);
                    track[i].add(eon[i][j]);
                    
                    s.setMessage(128,i,j,50);
                    eoff[i][j]=new MidiEvent(s,k+=5);
                    track[i].add(eoff[i][j]);
                }
             }
            player.setSequence(seq);
            player.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
