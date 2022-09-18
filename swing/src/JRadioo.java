import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioo implements ActionListener {
    JLabel l;

    JRadioo()
    {
        JFrame f=new JFrame("radio button demo");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        l=new JLabel();
        f.add(l);

        JRadioButton r1=new JRadioButton("Male");
        r1.addActionListener(this);
        f.add(r1);

        JRadioButton r2=new JRadioButton("Female");
        r2.addActionListener(this);
        f.add(r2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

    }

    public void actionPerformed(ActionEvent e)
    {
        l.setText(e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JRadioo();
            }
        });
    }
}
