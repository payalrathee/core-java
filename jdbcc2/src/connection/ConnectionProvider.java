package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private static Connection con;
    public static Connection provideConnection()
    {
        if(con==null)
        {
            try
            {
                con= DriverManager.getConnection(DBInfo.url,DBInfo.username,DBInfo.password);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
        return con;
    }
}
