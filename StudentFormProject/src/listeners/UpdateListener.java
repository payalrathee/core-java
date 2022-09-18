package listeners;

import dao.UpdateDao;
import guiForms.UpdateForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateListener implements ActionListener {
    UpdateForm updateForm;
    public UpdateListener(UpdateForm f)
    {
        updateForm=f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String id=updateForm.tf1.getText();
        updateForm.tf1.setText("");

        String newValue="";
        String action=e.getActionCommand();
        boolean isUpdated=false;
        if(action.equals("Update Class"))
        {
            newValue=updateForm.tf2.getText();
            updateForm.tf2.setText("");
            isUpdated= UpdateDao.updateClass(Integer.parseInt(id),newValue);
        }
        else if(action.equals("Update Section"))
        {
            newValue=updateForm.tf3.getText();
            updateForm.tf3.setText("");
            isUpdated= UpdateDao.updateSection(Integer.parseInt(id),newValue);
        }
        else if(action.equals("Update DOB"))
        {
            newValue=updateForm.tf4.getText();
            updateForm.tf4.setText("");
            isUpdated= UpdateDao.updateDOB(Integer.parseInt(id),newValue);
        }
        else if(action.equals("Update Address"))
        {
            newValue=updateForm.tf5.getText();
            updateForm.tf5.setText("");
            isUpdated= UpdateDao.updateAddress(Integer.parseInt(id),newValue);
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
