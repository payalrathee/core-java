package layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Card extends Frame {
    Card()
    {
        setVisible(true);
        setSize(200,200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Button b1=new Button("a");
        Button b2=new Button("b");
        Button b3=new Button("c");
        Button b4=new Button("d");
        Button b5=new Button("e");

        Panel p=new Panel();
        CardLayout cl=new CardLayout();
        p.setLayout(cl);
        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);

        add(p);
        cl.next(p);
        cl.previous(p);
        cl.previous(p);
        cl.last(p);
        cl.first(p);

    }

    public static void main(String[] args) {
        new Card();
    }
}
