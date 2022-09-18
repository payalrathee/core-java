package guiForms;

import listeners.LoginListener;
import listeners.StudentListener;

import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public JLabel id,pwd;
    public JTextField tf1,tf2;
    public JButton login,cancel;
    StudentListener stListener;

    public boolean isValidUser=false;

    public LoginForm(StudentListener l)
    {
        this.stListener=l;

        JFrame frame=new JFrame("Login Form");
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(2,2,20));
        frame.setLocation(150,150);
        frame.setSize(350,350);
        GridBagLayout g=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        frame.setLayout(g);

        id=new JLabel("User ID        :");
        id.setForeground(Color.white);
        pwd=new JLabel("Password    :");
        pwd.setForeground(Color.white);

        tf1=new JTextField(15);
        tf1.setBackground(Color.gray);tf1.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf2=new JTextField(15);
        tf2.setBackground(Color.gray);tf2.setFont(new Font(Font.DIALOG,Font.BOLD,15));

        login=new JButton("Login");
        login.addActionListener(new LoginListener(this,stListener));
        login.setBackground(Color.blue);
        login.setForeground(Color.white);

//        cancel=new JButton("Cancel");
//        cancel.setBackground(Color.red);
//        cancel.setForeground(Color.white);

        Insets i=new Insets(10,10,10,10);
        gc.insets=i;

        gc.gridx=0;gc.gridy=0; frame.add(id,gc);
        gc.gridx=0;gc.gridy=1; frame.add(pwd,gc);

        gc.fill=GridBagConstraints.HORIZONTAL;

        gc.gridx=1;gc.gridy=0; frame.add(tf1,gc);
        gc.gridx=1;gc.gridy=1; frame.add(tf2,gc);

        gc.gridwidth=2;gc.gridx=0;gc.gridy=2; frame.add(login,gc);
        //gc.gridx=1;gc.gridy=2; frame.add(cancel,gc);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
