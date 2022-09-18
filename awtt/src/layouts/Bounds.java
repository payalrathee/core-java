package layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bounds extends Frame {
    Label l1,l2;
    TextField tf1,tf2;

    Bounds()
    {
        setVisible(true);
        setSize(500,500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);

        l1=new Label("Name");
        l1.setBounds(50,100,50,40);
        l2=new Label("Roll");
        l2.setBounds(50,200,50,40);

        tf1=new TextField();
        tf1.setBounds(100,100,200,40);
        tf2=new TextField();
        tf2.setBounds(100,200,200,40);

        add(l1);add(tf1);
        add(l2);add(tf2);
    }

    public static void main(String[] args) {
        new Bounds();
    }
}
