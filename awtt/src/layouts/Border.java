package layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Border extends Frame{
    Panel p1,p2,p3;
    Button b1,b2,b3,b4;
    Label l1,l2,l3,l4,l5,l6,l7,l8;


    Border()
    {
        setVisible(true);
        setSize(100,100);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b1=new Button("click");
        b2=new Button("submit");
        b3=new Button("update");
        b4=new Button("deleteee");

        l3=new Label("name");
        l4=new Label("class");

        l1=new Label("hello");
        l2=new Label("world");


        p1=new Panel();
        p1.setBackground(Color.pink);


        p1.add(l1);p1.add(l2);p1.add(l3);p1.add(l4);

        p2=new Panel();
        p2.setBackground(Color.orange);


        p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);


        add(p1,BorderLayout.WEST);
        add(p2,BorderLayout.EAST);
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);

        p3=new Panel();
        p3.setBackground(Color.red);
        l5=new Label("india");
        l6=new Label("japan");
        l7=new Label("uk");
        l8=new Label("korea");
        p3.add(l5);p3.add(l6);p3.add(l7);p3.add(l8);

        add(p3,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new Border();
    }
}
