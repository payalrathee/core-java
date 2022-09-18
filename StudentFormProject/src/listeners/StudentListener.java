package listeners;

import guiForms.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentListener implements ActionListener {
    boolean isLoggedIn=false;

    @Override
    public void actionPerformed(ActionEvent e) {
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
}
