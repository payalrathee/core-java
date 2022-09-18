package basics2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Connection con=null;
        try
        {
            con=ConnectionProvider.getConnection();
            PreparedStatement p=con.prepareStatement("insert into book(name,subject,author,sid) values(?,?,?,?);");

            Scanner sc =new Scanner(System.in);
            String name,subject,author;
            int sid;

            System.out.println("enter name :");
            name=sc.nextLine();
            System.out.println("enter subject :");
            subject=sc.nextLine();
            System.out.println("enter author :");
            author=sc.nextLine();
            System.out.println("enter sid :");
            sid=sc.nextInt();

            p.setString(1,name);
            p.setString(2,subject);
            p.setString(3,author);
            p.setInt(4,sid);

            p.executeUpdate();
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
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
}
