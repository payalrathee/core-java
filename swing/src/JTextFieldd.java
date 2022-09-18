import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTextFieldd {
    JTextFieldd()
    {
        JFrame f=new JFrame("TextField Demo");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JLabel l=new JLabel();
        f.add(l);

        JTextField tf=new JTextField("enter text",10);
        tf.setForeground(Color.gray);
        tf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tf.setText("");
            }
        });
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=e.getActionCommand();
                l.setText(s);
            }
        });
        f.add(tf);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFieldd();
            }
        });
    }
}
