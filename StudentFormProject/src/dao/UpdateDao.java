package dao;

import connection.ConnectionProvider;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDao {
    public static boolean updateClass(int id,String newValue)
    {
        boolean isClassUpdated=false;
        Connection con=null;

        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("update student set class=? where id=?;");
            p.setString(1,newValue);
            p.setInt(2,id);
            int r=p.executeUpdate();
            if(r>0)isClassUpdated=true;
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try{con.close();}
            catch (SQLException e) {
                System.out.println(e);
            }
        }

        return isClassUpdated;
    }

    public static boolean updateSection(int id,String newValue)
    {
        boolean isSectionUpdated=false;
        Connection con=null;

        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("update student set section=? where id=?;");
            p.setString(1,newValue);
            p.setInt(2,id);
            int r=p.executeUpdate();
            if(r>0)isSectionUpdated=true;
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try{con.close();}
            catch (SQLException e) {
                System.out.println(e);
            }
        }

        return isSectionUpdated;
    }
    public static boolean updateDOB(int id,String newValue)
    {
        boolean isDOBUpdated=false;
        Connection con=null;

        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("update student set dob=? where id=?;");
            p.setDate(1,Date.valueOf(newValue));
            p.setInt(2,id);
            int r=p.executeUpdate();
            if(r>0)isDOBUpdated=true;
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try{con.close();}
            catch (SQLException e) {
                System.out.println(e);
            }
        }

        return isDOBUpdated;
    }
    public static boolean updateAddress(int id,String newValue)
    {
        boolean isAddressUpdated=false;
        Connection con=null;

        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("update student set address=? where id=?;");
            p.setString(1,newValue);
            p.setInt(2,id);
            int r=p.executeUpdate();
            if(r>0)isAddressUpdated=true;
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try{con.close();}
            catch (SQLException e) {
                System.out.println(e);
            }
        }

        return isAddressUpdated;
    }
    public static boolean updateContact(int id,String newValue)
    {
        boolean isContactUpdated=false;
        Connection con=null;

        try
        {
            con= ConnectionProvider.provideConnection();
            PreparedStatement p=con.prepareStatement("update student set mobile=? where id=?;");
            p.setString(1,newValue);
            p.setInt(2,id);
            int r=p.executeUpdate();
            if(r>0)isContactUpdated=true;
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        finally {
            try{con.close();}
            catch (SQLException e) {
                System.out.println(e);
            }
        }

        return isContactUpdated;
    }

}
