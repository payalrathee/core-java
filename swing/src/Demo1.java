import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Demo1 {
    JButton b;

    Demo1()
    {
        JFrame f=new JFrame("MyFrame");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b=new JButton("change color");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rd=new Random();
                int r=rd.nextInt(255);
                int g=rd.nextInt(255);
                int b=rd.nextInt(255);
                f.getContentPane().setBackground(new Color(r,g,b));
            }
        });

        f.add(b);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Demo1();
            }
        });
    }
}
