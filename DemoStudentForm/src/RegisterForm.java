import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegisterForm implements ActionListener {
    public JLabel fname,lname,pwd;
    public JTextField tf1,tf2,tf3;
    public JButton register;

    public RegisterForm()
    {
        JFrame frame=new JFrame("Login Form");
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(2,2,20));
        frame.setLocation(150,150);
        frame.setSize(400,400);
        GridBagLayout g=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        frame.setLayout(g);

        fname=new JLabel("First Name:");
        fname.setForeground(Color.white);
        lname=new JLabel("Last Name:");
        lname.setForeground(Color.white);
        pwd=new JLabel("Password");
        pwd.setForeground(Color.white);

        tf1=new JTextField(15);
        tf1.setBackground(Color.gray);tf1.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf2=new JTextField(15);
        tf2.setBackground(Color.gray);tf2.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf3=new JTextField(15);
        tf3.setBackground(Color.gray);tf3.setFont(new Font(Font.DIALOG,Font.BOLD,15));

        register=new JButton("Register");
        register.addActionListener(this);
        register.setBackground(Color.blue);
        register.setForeground(Color.white);

        Insets i=new Insets(10,10,10,10);
        gc.insets=i;
        gc.fill=GridBagConstraints.HORIZONTAL;

        gc.gridx=0;gc.gridy=0; frame.add(fname,gc);
        gc.gridx=0;gc.gridy=1; frame.add(lname,gc);
        gc.gridx=0;gc.gridy=2; frame.add(pwd,gc);

        gc.gridx=1;gc.gridy=0; frame.add(tf1,gc);
        gc.gridx=1;gc.gridy=1; frame.add(tf2,gc);
        gc.gridx=1;gc.gridy=2; frame.add(tf3,gc);

        gc.gridwidth=2;
        gc.gridx=0;gc.gridy=3; frame.add(register,gc);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String fname=tf1.getText();
        String lname=tf2.getText();
        String pwd=tf3.getText();
        int id=-1;

        tf1.setText("");
        tf2.setText("");
        tf3.setText("");

        if(fname.equals("")||lname.equals("")||pwd.equals(""))
            JOptionPane.showMessageDialog(null,"Please enter the details!");
        else
        {
            Connection con=null;
            try
            {
                con= ConnectionProvider.provideConnection();
                PreparedStatement p=con.prepareStatement("insert into user(lname,fname,pwd) values(?,?,?);");
                p.setString(1,fname);
                p.setString(2,lname);
                p.setString(3,pwd);
                int r=p.executeUpdate();

                if(r>0)
                {
                    Statement s=con.createStatement();
                    ResultSet rs=s.executeQuery("select max(id) from user;");
                    rs.next();
                    id=rs.getInt(1);
                }
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
            finally
            {
                try
                {
                    con.close();
                }
                catch (SQLException ex)
                {
                    System.out.println(ex);
                }
            }
            if(id!=-1)
            {
                JOptionPane.showMessageDialog(null,"Your id is : "+id);
            }
            else
                JOptionPane.showMessageDialog(null,"Registration failed! Try Again.");
        }
    }
}
