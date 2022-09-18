import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveForm implements ActionListener
{
    public JLabel id;
    public JTextField tf1;
    public JButton remove;

    public RemoveForm()
    {
        JFrame frame=new JFrame("Remove Student");
        GridBagLayout g=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        frame.setLayout(g);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(2,2,20));
        frame.setLocation(150,150);

        Insets i=new Insets(10,10,10,10);
        gc.insets=i;
        gc.fill=GridBagConstraints.HORIZONTAL;


        id=new JLabel("Student Id",JLabel.LEFT);
        id.setForeground(Color.white);
        gc.gridx=0;gc.gridy=0;frame.add(id,gc);

        tf1=new JTextField(15);
        tf1.setBackground(Color.gray);tf1.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        gc.gridx=1;gc.gridy=0;frame.add(tf1,gc);

        remove=new JButton("Remove Student");
        remove.addActionListener(this);
        remove.setBackground(Color.BLUE);remove.setForeground(Color.white);
        gc.gridx=0;gc.gridy=1;gc.gridwidth=2;frame.add(remove,gc);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame .setSize(300,300);
    }
    public void actionPerformed(ActionEvent e) {
        String id=tf1.getText();
        tf1.setText("");
        boolean isRemoved=false;

        if(id.equals(""))
            JOptionPane.showMessageDialog(null,"Please enter the id!");
        else
        {
            Connection con=null;
            try
            {
                con= ConnectionProvider.provideConnection();
                PreparedStatement p=con.prepareStatement("delete from student where id=?");
                p.setInt(1,Integer.parseInt(id));
                int r=p.executeUpdate();
                if(r>0)
                    isRemoved=true;
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
            finally {
                try{con.close();}
                catch(SQLException ex) {
                    System.out.println(ex);
                }
            }
            if(isRemoved)
                JOptionPane.showMessageDialog(null,"Removed Successfully!");
            else
                JOptionPane.showMessageDialog(null,"Failed! Try again.");
        }
    }
}
