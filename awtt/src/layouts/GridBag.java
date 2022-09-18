package layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBag extends Frame {
    Button b1,b2,b3,b4,b5;

    GridBag()
    {

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        GridBagLayout g=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        setLayout(g);

        b1=new Button("a");
        b2=new Button("b");
        b3=new Button("c");
        b4=new Button("d");
        b5=new Button("e");

        Insets i=new Insets(5,5,5,5);

        gc.ipadx=5;
        gc.ipady=5;
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.insets=i;
        gc.weightx=0.1;

        gc.gridx=1;
        gc.gridy=0;
        gc.gridwidth=2;
        add(b1,gc);

        gc.gridwidth=1;
        gc.gridx=3;
        gc.gridy=0;
        add(b2,gc);

        gc.gridx=1;
        gc.gridy=1;
        add(b3,gc);

        gc.gridx=3;
        gc.gridy=1;
        add(b4,gc);


        gc.gridx=2;
        gc.gridy=3;
        add(b5,gc);

        setVisible(true);
        setSize(500,500);
    }
    public static void main(String[] args) {
        new GridBag();
    }
}
