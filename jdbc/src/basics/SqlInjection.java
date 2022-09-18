package basics;

import java.sql.*;
import java.util.Scanner;

public class SqlInjection {
    public static void main(String[] args) {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","payal");
            Statement statement=con.createStatement();

            int id,sid;
            String name,author,subject;

            Scanner sc=new Scanner(System.in);

            System.out.println("enter id :");
            id=sc.nextInt();
            System.out.println("enter name :");
            name=sc.next();
            System.out.println("enter author :");
            author=sc.next();
            System.out.println("enter subject :");
            subject=sc.next();
            System.out.println("enter sid :");
            sid=sc.nextInt();

            String query="insert into abc values ("+id+",'"+name+"','"+author+"','"+subject+"',"+sid+");";

            int r=statement.executeUpdate(query);
            if(r>0)
                System.out.println("inserted successfully!");
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
