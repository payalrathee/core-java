package layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Grid extends Frame {

    Grid()
    {
        setVisible(true);
        setSize(100,100);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new GridLayout(3,3));

//        for(int i=0;i<9;i++)
//        {
//            Button b=new Button("Button"+i);
//            add(b,8-i);
//        }

        Button b1=new Button("a");
        Button b2=new Button("a");
        Button b3=new Button("a");
        Button b4=new Button("a");
        Button b5=new Button("a");

        add(b2,0);
    }

    public static void main(String[] args) {
        new Grid();
    }
}
