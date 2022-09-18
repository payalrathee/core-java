import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTogglee {

    JTogglee()
    {
        JFrame f=new JFrame("Toggle button example");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JLabel l=new JLabel();
        f.add(l);

        JToggleButton t=new JToggleButton("Click",true);
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t.isSelected())
                    l.setText("Selected");
                else
                    l.setText("not selected");
            }
        });
        f.add(t);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTogglee();
            }
        });
    }
}
