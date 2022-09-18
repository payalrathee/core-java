import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxx implements ItemListener {
    JLabel l;
    JCheckBoxx()
    {
        JFrame f=new JFrame("checkbox demo");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        l=new JLabel();
        f.add(l);

        JCheckBox c1=new JCheckBox("c");
        c1.addItemListener(this);
        f.add(c1);

        JCheckBox c2=new JCheckBox("cpp");
        c2.addItemListener(this);
        f.add(c2);

        JCheckBox c3=new JCheckBox("java");
        c3.addItemListener(this);
        f.add(c3);
    }

    public void itemStateChanged(ItemEvent e)
    {
        JCheckBox c=(JCheckBox)e.getItem();
        if(c.isSelected())
            l.setText(c.getText()+" is selected");
        else
            l.setText(c.getText()+" is deselected");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JCheckBoxx();
            }
        });
    }
}
