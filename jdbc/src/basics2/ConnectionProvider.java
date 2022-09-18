package basics2;

import java.sql.*;

public final class ConnectionProvider {
    public static Connection getConnection()
    {
        Connection con=null;
        try
        {
            Class.forName(DatabaseDetails.DATABASE_DRIVER);
            con=DriverManager.getConnection(DatabaseDetails.DATABASE_URL,DatabaseDetails.DATABASE_USER,DatabaseDetails.DATABASE_PWD);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return con;
    }
}
