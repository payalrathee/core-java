import connection.ConnectionProvider;

import java.sql.*;

public class CallableStatementt {
    public static void main(String[] args) {
        Connection con= ConnectionProvider.provideConnection();
        try
        {
//            CallableStatement c=con.prepareCall("call loadCalendar(?,?)");
//            c.setDate(1,Date.valueOf("2022-10-01"));
//            c.setInt(2,31);
//            c.executeUpdate();

//            CallableStatement c=con.prepareCall("{?=call isEven(?)}");
//            c.setInt(2,4);
//            c.registerOutParameter(1, Types.BOOLEAN);
//            c.execute();
//            System.out.println(c.getInt(1));
//
//            CallableStatement c=con.prepareCall("call counterForStudent(?)");
//            c.registerOutParameter(1,Types.INTEGER);
//            c.executeUpdate();
//            System.out.println(c.getInt(1));

            CallableStatement c=con.prepareCall("call inc(?)");
            c.registerOutParameter(1,Types.INTEGER);
            c.setInt(1,5);
            c.executeUpdate();
            System.out.println(c.getInt(1));



        }
        catch(SQLException e)
        {
            System.out.println(e);
        }

    }
}
