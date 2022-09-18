import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginForm implements ActionListener {
    public JLabel id,pwd;
    public JTextField tf1,tf2;
    public JButton login,cancel;
    StudentForm stListener;
    public boolean isValidUser=false;

    public LoginForm(StudentForm l)
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
        login.addActionListener(new LoginForm(stListener));
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
    @Override
    public void actionPerformed(ActionEvent e) {
        String id=tf1.getText();
        String pwd=tf2.getText();

        tf1.setText("");
        tf2.setText("");

        if(pwd.equals("")||id.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill the details!");
        }
        else
        {
            Connection con=null;
            try
            {
                con= ConnectionProvider.provideConnection();
                PreparedStatement p=con.prepareStatement("select * from user where id=? and pwd=?");
                p.setInt(1,Integer.parseInt(id));
                p.setString(2,pwd);
                ResultSet rs=p.executeQuery();

                if(rs.next())
                    isValidUser=true;
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
            finally {
                try {
                    con.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }

            if(isValidUser)
            {
                JOptionPane.showMessageDialog(null,"You are successfully logged in!");
                stListener.isLoggedIn=true;
            }
            else
                JOptionPane.showMessageDialog(null,"Please enter valid details!");
        }
    }
}
