import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonn implements ActionListener {
    JLabel l;

    JButtonn()
    {
        JFrame f=new JFrame("Button Demo");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        l=new JLabel();
        f.add(l);

        JButton b=new JButton("Register");
        b.addActionListener(this);
        f.add(b);

        JButton b1=new JButton("Update");
        b1.addActionListener(this);
        f.add(b1);

        JButton b2=new JButton("Delete");
        b2.addActionListener(this);
        f.add(b2);

    }

   public void actionPerformed(ActionEvent e)
    {
        l.setText(e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JButtonn();
            }
        });
    }
}
