package dao;

import beans.RegisterBean;
import connection.ConnectionProvider;

import java.sql.*;

public class RegisterDao {
    public static int registerUser(RegisterBean b)
    {
        int id=-1;
        Connection con=null;

        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("insert into user(lname,fname,pwd) values(?,?,?);");
            p.setString(1,b.fname);
            p.setString(2,b.lname);
            p.setString(3,b.pwd);
            int r=p.executeUpdate();

            if(r>0)
            {
                Statement s=con.createStatement();
                ResultSet rs=s.executeQuery("select max(id) from user;");
                rs.next();
                id=rs.getInt(1);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                con.close();
            }
            catch (SQLException e)
            {
                System.out.println(e);
            }
        }
        return id;
    }
}
