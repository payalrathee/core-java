package listeners;

import dao.RemoveDao;
import guiForms.RemoveForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveListener implements ActionListener {
    RemoveForm removeForm;
    public RemoveListener(RemoveForm f)
    {
        removeForm=f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String id=removeForm.tf1.getText();

        removeForm.tf1.setText("");

        if(id.equals(""))
            JOptionPane.showMessageDialog(null,"Please enter the id!");
        else
        {
            boolean isRemoved= RemoveDao.removeStudent(Integer.parseInt(id));
            if(isRemoved)
                JOptionPane.showMessageDialog(null,"Removed Successfully!");
            else
                JOptionPane.showMessageDialog(null,"Failed! Try again.");
        }
    }
}
