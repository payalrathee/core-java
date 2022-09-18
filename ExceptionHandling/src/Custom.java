import java.util.*;

public class Custom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String name="";
        String pwd="";

        System.out.println("Welcome");

        System.out.println("Enter name and password :");
        name=s.next();
        pwd=s.next();

        try
        {
            if(name.equals("Payal"))
            {
                if(pwd.equals("Rathee"))
                {
                    System.out.println("Login succesfull!!");
                }
                else
                {
                    throw new ex("please enter valid password!!");
                }
            }
            else
            {
                throw new ex("Please enter valid name!!");
            }
        }
        catch(ex e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Have a nice day!!");
        }

    }
}
class ex extends RuntimeException
{
    ex(String s)
    {
        super(s);
    }
}