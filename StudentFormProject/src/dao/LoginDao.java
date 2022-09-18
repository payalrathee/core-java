package dao;

import beans.LoginBean;
import connection.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    public static boolean isValidUser(LoginBean b)
    {
        boolean isValid=false;
        Connection con=null;
        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("select * from user where id=? and pwd=?");
            p.setInt(1,b.id);
            p.setString(2,b.pwd);
            ResultSet rs=p.executeQuery();

            if(rs.next())
                isValid=true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try
            {
                con.close();
            }
            catch (SQLException e)
            {
                System.out.println(e);
            }
        }
        return isValid;
    }
}
