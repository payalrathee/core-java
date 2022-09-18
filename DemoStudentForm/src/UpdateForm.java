import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateForm implements ActionListener {

    public JLabel id,cls,sec,db,adr,mob;
    public JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    public JButton updateStd,updateSection,updateDOB,updateAdr,updateMob;

    public UpdateForm()
    {
        JFrame frame=new JFrame("Update Details");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(2,2,20));
        frame.setLocation(150,150);

        id=new JLabel("Student ID");
        id.setForeground(Color.white);
        id.setBounds(80,50,80,30);
        frame.add(id);

        tf1=new JTextField();
        tf1.setBackground(Color.gray);tf1.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        tf1.setBounds(180,50,150,25);
        frame.add(tf1);

        JTabbedPane pane=new JTabbedPane();
        pane.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        pane.setBackground(new Color(10,100,250));
        pane.setForeground(Color.black);
        pane.setBounds(70,100,360,250);
        frame.add(pane);

        Insets i=new Insets(10,10,10,10);

        JPanel std=new JPanel();
        std.setBackground(new Color(2,2,20));
        GridBagLayout g1=new GridBagLayout();
        GridBagConstraints gc1=new GridBagConstraints();
        std.setLayout(g1);
        gc1.insets=i;gc1.fill=GridBagConstraints.HORIZONTAL;
        cls=new JLabel("Class");cls.setForeground(Color.white);gc1.gridx=0;gc1.gridy=0;std.add(cls,gc1);
        tf2=new JTextField(15);tf2.setBackground(Color.gray);tf2.setFont(new Font(Font.DIALOG,Font.BOLD,15));;gc1.gridx=1;std.add(tf2,gc1);
        updateStd=new JButton("Update Class");updateStd.setBackground(Color.blue);updateStd.setForeground(Color.white);gc1.gridx=0;gc1.gridy=1;gc1.gridwidth=2;std.add(updateStd,gc1);
        updateStd.addActionListener(this);
        pane.addTab("Class",std);

        JPanel section=new JPanel();
        section.setBackground(new Color(2,2,20));
        GridBagLayout g2=new GridBagLayout();
        GridBagConstraints gc2=new GridBagConstraints();
        section.setLayout(g2);
        gc2.insets=i;gc2.fill=GridBagConstraints.HORIZONTAL;
        sec=new JLabel("Section");sec.setForeground(Color.white);gc2.gridx=0;gc2.gridy=0;section.add(sec,gc2);
        tf3=new JTextField(15);tf3.setBackground(Color.gray);tf3.setFont(new Font(Font.DIALOG,Font.BOLD,15));gc2.gridx=1;section.add(tf3,gc2);
        updateSection=new JButton("Update Section");updateSection.setBackground(Color.blue);updateSection.setForeground(Color.white);gc2.gridx=0;gc2.gridy=1;gc2.gridwidth=2;section.add(updateSection,gc2);
        updateSection.addActionListener(this);
        pane.addTab("Section",section);

        JPanel dob=new JPanel();
        dob.setBackground(new Color(2,2,20));
        GridBagLayout g3=new GridBagLayout();
        GridBagConstraints gc3=new GridBagConstraints();
        dob.setLayout(g3);
        gc3.insets=i;gc3.fill=GridBagConstraints.HORIZONTAL;
        db=new JLabel("Date of Birth");db.setForeground(Color.white);gc3.gridx=0;gc3.gridy=0;dob.add(db,gc3);
        tf4=new JTextField(15);tf4.setBackground(Color.gray);tf4.setFont(new Font(Font.DIALOG,Font.BOLD,15));gc3.gridx=1;dob.add(tf4,gc3);
        updateDOB=new JButton("Update DOB");updateDOB.setBackground(Color.blue);updateDOB.setForeground(Color.white);gc3.gridx=0;gc3.gridy=1;gc3.gridwidth=2;dob.add(updateDOB,gc3);
        updateDOB.addActionListener(this);
        pane.addTab("DOB",dob);


        JPanel address=new JPanel();
        address.setBackground(new Color(2,2,20));
        GridBagLayout g4=new GridBagLayout();
        GridBagConstraints gc4=new GridBagConstraints();
        address.setLayout(g4);
        gc4.insets=i;gc4.fill=GridBagConstraints.HORIZONTAL;
        adr=new JLabel("Address");adr.setForeground(Color.white);gc4.gridx=0;gc4.gridy=0;address.add(adr,gc4);
        tf5=new JTextField(15);tf5.setBackground(Color.gray);tf5.setFont(new Font(Font.DIALOG,Font.BOLD,15));gc4.gridx=1;address.add(tf5,gc4);
        updateAdr=new JButton("Update Address");updateAdr.setBackground(Color.blue);updateAdr.setForeground(Color.white);gc4.gridx=0;gc4.gridy=1;gc4.gridwidth=2;address.add(updateAdr,gc4);
        updateAdr.addActionListener(this);
        pane.addTab("Address",address);

        JPanel mobile=new JPanel();
        mobile.setBackground(new Color(2,2,20));
        GridBagLayout g5=new GridBagLayout();
        GridBagConstraints gc5=new GridBagConstraints();
        mobile.setLayout(g5);
        gc5.insets=i;gc5.fill=GridBagConstraints.HORIZONTAL;
        mob=new JLabel("Mobile No.");mob.setForeground(Color.white);gc5.gridx=0;gc5.gridy=0;mobile.add(mob,gc5);
        tf6=new JTextField(15);tf6.setBackground(Color.gray);tf6.setFont(new Font(Font.DIALOG,Font.BOLD,15));gc5.gridx=1;mobile.add(tf6,gc5);
        updateMob=new JButton("Update Contact");updateMob.setBackground(Color.blue);updateMob.setForeground(Color.white);gc5.gridx=0;gc5.gridy=1;gc5.gridwidth=2;mobile.add(updateMob,gc5);
        updateMob.addActionListener(this);
        pane.addTab("Mobile",mobile);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,450);
    }
    public void actionPerformed(ActionEvent e) {
        String id=tf1.getText();
        tf1.setText("");

        String newValue="";
        String action=e.getActionCommand();
        boolean isUpdated=false;

        Connection con=null;
        if(action.equals("Update Class"))
        {
            newValue=tf2.getText();
            tf2.setText("");
            try
            {
                con= ConnectionProvider.provideConnection();
                PreparedStatement p=con.prepareStatement("update student set class=? where id=?;");
                p.setString(1,newValue);
                p.setInt(2,Integer.parseInt(id));
                int r=p.executeUpdate();
                if(r>0)isUpdated=true;
            }
            catch (SQLException ex)
            {
                System.out.println(ex);
            }
            finally {
                try{con.close();}
                catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        else if(action.equals("Update Section"))
        {
            newValue=tf3.getText();
            tf3.setText("");
            try
            {
                PreparedStatement p=con.prepareStatement("update student set section=? where id=?;");
                p.setString(1,newValue);
                p.setInt(2,Integer.parseInt(id));
                int r=p.executeUpdate();
                if(r>0)isUpdated=true;
            }
            catch (SQLException ex)
            {
                System.out.println(ex);
            }
            finally {
                try{con.close();}
                catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        else if(action.equals("Update DOB"))
        {
            newValue=tf4.getText();
            tf4.setText("");
            try
            {
                PreparedStatement p=con.prepareStatement("update student set dob=? where id=?;");
                p.setDate(1, Date.valueOf(newValue));
                p.setInt(2,Integer.parseInt(id));
                int r=p.executeUpdate();
                if(r>0)isUpdated=true;
            }
            catch (SQLException ex)
            {
                System.out.println(ex);
            }
            finally {
                try{con.close();}
                catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        else if(action.equals("Update Address"))
        {
            newValue=tf5.getText();
            tf5.setText("");

        }
        else
        {
            newValue=updateForm.tf6.getText();
            updateForm.tf6.setText("");
            isUpdated= UpdateDao.updateContact(Integer.parseInt(id),newValue);
        }

        if(isUpdated)
        {
            JOptionPane.showMessageDialog(null,"Details are updated!");
        }
        else
            JOptionPane.showMessageDialog(null,"Updation Failed! Try Again.");
    }
}
