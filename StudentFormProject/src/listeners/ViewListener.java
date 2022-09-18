package listeners;

import dao.ViewDao;
import guiForms.ViewForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewListener implements ActionListener {
    ViewForm viewForm;
    public ViewListener(ViewForm f)
    {
        viewForm=f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String id=viewForm.tf1.getText();
        viewForm.tf1.setText("");
        String action=e.getActionCommand();

        viewForm.model.setRowCount(0);
        if(action.equals("View all Details"))
            ViewDao.viewAllDetails(viewForm);
        else
            ViewDao.viewDetails(viewForm,Integer.parseInt(id));
    }
}
