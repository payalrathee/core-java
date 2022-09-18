package dao;

import beans.AddBean;
import connection.ConnectionProvider;

import java.sql.*;

public class AddDao {
    public static int addStudent(AddBean b)
    {
        int id=-1;
        Connection con=null;
        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("insert into student(name,class,section,dob,address,mobile) values(?,?,?,?,?,?);");
            p.setString(1,b.name);
            p.setInt(2,b.std);
            p.setString(3,b.section);
            p.setDate(4,Date.valueOf(b.dob));
            p.setString(5,b.address);
            p.setString(6,b.mobile);

            int r=p.executeUpdate();

            if(r>0)
            {
                Statement s=con.createStatement();
                ResultSet rs=s.executeQuery("select max(id) from student");
                rs.next();
                id=rs.getInt(1);
            }
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
            catch (SQLException e) {
                System.out.println(e);
            }
        }

        return id;
    }
}
