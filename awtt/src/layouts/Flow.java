package layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Flow extends Frame{
    Label l1,l2;
    TextField tf1,tf2;

    Flow()
    {
        setVisible(true);
        setSize(500,500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout(FlowLayout.RIGHT,100,100));

        l1=new Label("Name");
        l2=new Label("Roll");

        tf1=new TextField("enter your name",40);
        tf2=new TextField("enter your roll",40);

        add(l1);add(tf1);
        add(l2);add(tf2);
    }

    public static void main(String[] args) {
        new Flow();
    }
}
