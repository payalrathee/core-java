import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm implements ActionListener {
    JPanel p;
    JLabel l;
    JButton add,update,remove,view,login,register;
    StudentForm stListener=new StudentForm();
    public boolean isLoggedIn=false;

    StudentForm()
    {
        JFrame frame=new JFrame("Student Form");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(2,2,20));
        frame.setLocation(100,100);

        l=new JLabel("Select an option ");
        l.setForeground(Color.white);
        l.setBounds(150,50,200,50);
        l.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        frame.add(l);

        p=new JPanel();
        p.setBackground(Color.gray);
        GridBagLayout g=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        p.setLayout(g);
        p.setBounds(150,100,200,200);

        add=new JButton("Add Student");
        add.setBackground(Color.orange);
        add.addActionListener(stListener);

        update=new JButton("Update Details");
        update.setBackground(Color.orange);
        update.addActionListener(stListener);

        remove=new JButton("Remove Student");
        remove.setBackground(Color.orange);
        remove.addActionListener(stListener);

        view=new JButton("View Details");
        view.setBackground(Color.orange);
        view.addActionListener(stListener);

        Insets i=new Insets(5,5,5,5);
        gc.gridx=30;
        gc.insets=i;

        gc.gridy=30; p.add(add,gc);
        gc.gridy=40; p.add(update,gc);
        gc.gridy=50; p.add(remove,gc);
        gc.gridy=60; p.add(view,gc);

        frame.add(p);

        login=new JButton("Login");
        login.addActionListener(stListener);
        login.setBackground(Color.red);
        login.setForeground(Color.white);
        login.setBounds(150,330,80,40);

        register=new JButton("Register");
        register.addActionListener(stListener);
        register.setBackground(Color.BLUE);
        register.setForeground(Color.white);
        register.setBounds(250,330,100,40);

        frame.add(login);frame.add(register);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame .setSize(500,500);
    }

    public void actionPerformed(ActionEvent e)
    {
        String action=e.getActionCommand();
        if(action.equals("Login"))
        {
            new LoginForm(this);
        }
        else if(action.equals("Register"))
        {
            new RegisterForm();
        }
        else if(action.equals("Add Student"))
        {
            if(isLoggedIn==false)
                new LoginForm(this);
            else
                new AddForm();
        }
        else if(action.equals("Update Details"))
        {
            if(isLoggedIn==false)
                new LoginForm(this);
            else
                new UpdateForm();
        }
        else if(action.equals("Remove Student"))
        {
            if(isLoggedIn==false)
                new LoginForm(this);
            else
                new RemoveForm();
        }
        else
        {
            if(isLoggedIn==false)
                new LoginForm(this);
            else
                new ViewForm();
        }
    }


    public static void main(String[] args) {
        new StudentForm();
    }
}
