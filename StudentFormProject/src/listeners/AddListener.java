package listeners;

import beans.AddBean;
import dao.AddDao;
import guiForms.AddForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddListener implements ActionListener {
    AddForm addForm;
    public AddListener(AddForm f)
    {
        addForm=f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name=addForm.tf1.getText();
        String std=addForm.tf2.getText();
        String section=addForm.tf3.getText();
        String dob=addForm.tf4.getText();
        String mobile=addForm.tf5.getText();
        String address=addForm.ta.getText();

        addForm.tf1.setText("");
        addForm.tf2.setText("");
        addForm.tf3.setText("");
        addForm.tf4.setText("");
        addForm.tf5.setText("");
        addForm.ta.setText("");


        if(name.equals("")||std.equals("")||section.equals("")||dob.equals("")||mobile.equals("")||address.equals(""))
            JOptionPane.showMessageDialog(null,"Please fill the details");
        else
        {
            AddBean b=new AddBean(name,Integer.parseInt(std),section,dob,mobile,address);
            int id= AddDao.addStudent(b);
            if(id!=-1)
            {
                JOptionPane.showMessageDialog(null,"Details are submitted successfully!\nStudent id : "+id);
            }
            else
                JOptionPane.showMessageDialog(null,"Submission Failed! Try Again.");
        }
    }
}
