import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batches {
    public static void main(String[] args) {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cust_info","root","payal");
            Statement s=con.createStatement();
            String s1="insert into cust values(101,'naman');";
            String s2="insert into cust values(102,'ashi');";
            s.addBatch(s1);
            s.addBatch(s2);
            s.executeBatch();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        finally
        {
            try{con.close();}
            catch(SQLException ex){}
        }
    }
}
