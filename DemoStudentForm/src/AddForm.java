import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AddForm implements ActionListener {
    public JLabel name,std,section,dob,address,mobile;
    public JTextField tf1,tf2,tf3,tf4,tf5;
    public JTextArea ta;
    public JButton add;

    public AddForm()
    {
        JFrame frame=new JFrame("Add Student");
        GridBagLayout g=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        frame.setLayout(g);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(2,2,20));
        frame.setLocation(150,150);

        Insets i=new Insets(5,5,5,5);
        gc.insets=i;

        gc.fill=GridBagConstraints.HORIZONTAL;
        name=new JLabel("Name",JLabel.LEFT);
        name.setForeground(Color.white);
        std=new JLabel("Class",JLabel.LEFT);
        std.setForeground(Color.white);
        section=new JLabel("Section",JLabel.LEFT);
        section.setForeground(Color.white);
        dob=new JLabel("Date of Birth",JLabel.LEFT);
        dob.setForeground(Color.white);
        address=new JLabel("Address",JLabel.LEFT);
        address.setForeground(Color.white);
        mobile=new JLabel("Mobile No.",JLabel.LEFT);
        mobile.setForeground(Color.white);

        gc.gridx=0;
        gc.gridy=0;frame.add(name,gc);
        gc.gridy=1;frame.add(std,gc);
        gc.gridy=2;frame.add(section,gc);
        gc.gridy=3;frame.add(dob,gc);
        gc.gridy=4;frame.add(mobile,gc);
        gc.gridy=5;frame.add(address,gc);

        tf1=new JTextField(15);
        tf1.setBackground(Color.gray);tf1.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf2=new JTextField(15);
        tf2.setBackground(Color.gray);tf2.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf3=new JTextField(15);
        tf3.setBackground(Color.gray);tf3.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf4=new JTextField(15);
        tf4.setBackground(Color.gray);tf4.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf5=new JTextField(15);
        tf5.setBackground(Color.gray);tf5.setFont(new Font(Font.DIALOG,Font.BOLD,15));

        gc.gridx=1;
        gc.gridy=0;frame.add(tf1,gc);
        gc.gridy=1;frame.add(tf2,gc);
        gc.gridy=2;frame.add(tf3,gc);
        gc.gridy=3;frame.add(tf4,gc);
        gc.gridy=4;frame.add(tf5,gc);

        ta=new JTextArea(5,15);
        ta.setBackground(Color.gray);ta.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        gc.gridwidth=2;
        gc.gridx=0;gc.gridy=6;
        frame.add(ta,gc);

        add=new JButton("Add Student");
        add.addActionListener(this);
        add.setBackground(Color.BLUE);add.setForeground(Color.white);
        gc.gridx=0;gc.gridy=7;
        frame.add(add,gc);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name=tf1.getText();
        String std=tf2.getText();
        String section=tf3.getText();
        String dob=tf4.getText();
        String mobile=tf5.getText();
        String address=ta.getText();
        int id=-1;

        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        ta.setText("");


        if(name.equals("")||std.equals("")||section.equals("")||dob.equals("")||mobile.equals("")||address.equals(""))
            JOptionPane.showMessageDialog(null,"Please fill the details");
        else
        {
            Connection con=null;
            try
            {
                con= ConnectionProvider.provideConnection();
                PreparedStatement p=con.prepareStatement("insert into student(name,class,section,dob,address,mobile) values(?,?,?,?,?,?);");
                p.setString(1,name);
                p.setInt(2,Integer.parseInt(std));
                p.setString(3,section);
                p.setDate(4, Date.valueOf(dob));
                p.setString(5,address);
                p.setString(6,mobile);

                int r=p.executeUpdate();

                if(r>0)
                {
                    Statement s=con.createStatement();
                    ResultSet rs=s.executeQuery("select max(id) from student");
                    rs.next();
                    id=rs.getInt(1);
                }
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
            finally {
                try
                {
                    con.close();
                }
                catch (SQLException ex) {
                    System.out.println(ex);
                }
            }

            if(id!=-1)
            {
                JOptionPane.showMessageDialog(null,"Details are submitted successfully!\nStudent id : "+id);
            }
            else
                JOptionPane.showMessageDialog(null,"Submission Failed! Try Again.");
        }
    }
}
