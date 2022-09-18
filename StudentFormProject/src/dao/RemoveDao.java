package dao;

import connection.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveDao {

public static boolean removeStudent(int id)
{
    boolean isRemoved =false;
    Connection con=null;
    try
    {
        con= ConnectionProvider.provideConnection();
        PreparedStatement p=con.prepareStatement("delete from student where id=?");
        p.setInt(1,id);
        int r=p.executeUpdate();
        if(r>0)
            isRemoved=true;
    }
    catch(SQLException e)
    {
        System.out.println(e);
    }
    finally {
        try{con.close();}
        catch(SQLException e) {
            System.out.println(e);
        }
    }

    return isRemoved;
}
}
