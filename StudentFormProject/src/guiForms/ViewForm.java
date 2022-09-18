package guiForms;

import listeners.ViewListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewForm {
    public JLabel id;
    public JTextField tf1;
    public JButton view,viewAll;
    public DefaultTableModel model;
    public JTable table;

    public ViewForm()
    {
        JFrame frame=new JFrame("View Details");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(2,2,20));
        frame.setLocation(150,150);

        GridBagLayout g=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        JPanel p=new JPanel();
        p.setBounds(50,50,400,100);
        p.setLayout(g);p.setBackground(new Color(2,2,20));
        frame.add(p);

        Insets i=new Insets(10,10,10,10);
        gc.insets=i;gc.fill=GridBagConstraints.HORIZONTAL;

        id=new JLabel("Student id",JLabel.LEFT);
        id.setForeground(Color.white);
        gc.gridx=0;gc.gridy=0;p.add(id,gc);

        tf1=new JTextField(15);
        tf1.setBackground(Color.gray);tf1.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        gc.gridx=1;p.add(tf1,gc);

        view=new JButton("View Details");
        view.addActionListener(new ViewListener(this));
        view.setBackground(Color.BLUE);view.setForeground(Color.white);
        gc.gridx=0;gc.gridy=1;p.add(view,gc);

        viewAll=new JButton("View all Details");
        viewAll.addActionListener(new ViewListener(this));
        gc.gridx=1;gc.gridy=1;p.add(viewAll,gc);


        String[] cols={"ID","Name","Class","Section","DOB","Mobile","Permanent Address"};
        model=new DefaultTableModel();
        model.setColumnIdentifiers(cols);
        table=new JTable(model);
        table.setGridColor(Color.black);
        table.setForeground(Color.white);
        table.setBackground(Color.darkGray);
        JScrollPane pane=new JScrollPane(table);
        pane.setBounds(50,200,400,200);
        frame.add(pane);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame .setSize(500,500);
    }

}
