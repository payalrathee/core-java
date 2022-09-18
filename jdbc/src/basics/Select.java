package basics;

import java.sql.*;

public class Select {
    public static void main(String[] args) {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","payal");
            Statement statement=con.createStatement();


            String query="select * from book;";

            ResultSet rs= statement.executeQuery(query);

            while(rs.next())
            {
                System.out.print(rs.getInt(1)+"      ");
                System.out.print(rs.getString(2)+"      ");
                System.out.print(rs.getString(3)+"      ");
                System.out.print(rs.getString(4)+"      ");
                System.out.print(rs.getInt(5)+"      ");
                System.out.println();
            }



        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
}





