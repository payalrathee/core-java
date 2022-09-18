package dao;

import connection.ConnectionProvider;
import guiForms.ViewForm;

import java.sql.*;

public class ViewDao {
    public static void viewAllDetails(ViewForm f)
    {
        String[] data=new String[7];
        Connection con=null;
        try
        {
            con= ConnectionProvider.provideConnection();
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("select * from student;");

            while(rs.next())
            {
                data[0]=rs.getInt(1)+"";
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                data[4]=rs.getString(5);
                data[5]=rs.getString(6);
                data[6]=rs.getString(7);

                f.model.addRow(data);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try{con.close();}
            catch (SQLException e){System.out.println(e);}
        }
    }

    public static void viewDetails(ViewForm f,int id)
    {
        String[] data=new String[7];
        Connection con=null;
        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("select * from student where id=?;");
            p.setInt(1,id);
            ResultSet rs=p.executeQuery();
            rs.next();
            data[0]=rs.getInt(1)+"";
            data[1]=rs.getString(2);
            data[2]=rs.getString(3);
            data[3]=rs.getString(4);
            data[4]=rs.getString(5);
            data[5]=rs.getString(6);
            data[6]=rs.getString(7);
            f.model.addRow(data);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try{con.close();}
            catch (SQLException e){System.out.println(e);}
        }
    }
}
