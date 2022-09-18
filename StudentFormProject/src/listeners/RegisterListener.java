package listeners;

import beans.RegisterBean;
import dao.RegisterDao;
import guiForms.RegisterForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterListener implements ActionListener {
    public RegisterForm registerForm;

    public RegisterListener(RegisterForm f)
    {
        this.registerForm =f;
    }
    public void actionPerformed(ActionEvent e)
    {
        String fname=registerForm.tf1.getText();
        String lname=registerForm.tf2.getText();
        String pwd=registerForm.tf3.getText();

        registerForm.tf1.setText("");
        registerForm.tf2.setText("");
        registerForm.tf3.setText("");

        if(fname.equals("")||lname.equals("")||pwd.equals(""))
            JOptionPane.showMessageDialog(null,"Please enter the details!");
        else
        {
            RegisterBean b=new RegisterBean(fname,lname,pwd);
            int id= RegisterDao.registerUser(b);
            if(id!=-1)
            {
                JOptionPane.showMessageDialog(null,"Your id is : "+id);
            }
            else
                JOptionPane.showMessageDialog(null,"Registration failed! Try Again.");
        }
    }
}
