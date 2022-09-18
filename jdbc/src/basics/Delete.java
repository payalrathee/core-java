package basics;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","payal");
            Statement statement=con.createStatement();

            int id;

            Scanner sc=new Scanner(System.in);

            System.out.println("enter id :");
            id=sc.nextInt();

            String query="basics.Delete from book where id="+id+";";

            int r=statement.executeUpdate(query);
            if(r>0)
                System.out.println("deleted successfully!");
            else
                System.out.println("error occured");



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

