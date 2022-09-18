package listeners;

import beans.LoginBean;
import dao.LoginDao;
import guiForms.LoginForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {
    LoginForm loginForm;
    StudentListener stListener;
    boolean isValidUser;
    public LoginListener(LoginForm f,StudentListener l)
    {
        this.loginForm=f;
        this.stListener=l;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id=loginForm.tf1.getText();
        String pwd=loginForm.tf2.getText();

        loginForm.tf1.setText("");
        loginForm.tf2.setText("");

        if(pwd.equals("")||id.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill the details!");
        }
        else
        {
            LoginBean l=new LoginBean(Integer.parseInt(id),pwd);
            isValidUser= LoginDao.isValidUser(l);

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
