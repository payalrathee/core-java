import javax.swing.*;
import java.awt.*;

public class Jlabell {
    Jlabell()
    {
        ImageIcon i=new ImageIcon("799795.jpg");

        JFrame f=new JFrame("Label Demo");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setIconImage(i.getImage());
        f.setLayout(new FlowLayout());

        JLabel l=new JLabel("my label",i,JLabel.LEADING);
        f.add(l);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Jlabell();
            }
        });
    }
}
