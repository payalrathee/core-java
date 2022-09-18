/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal
 */
class MyEx extends Exception{}
public class ExceptionHandling {
    public static void main(String[] args) {
        String t="no";
        try
        {
            doRisky(t);
            System.out.print("r");
            System.out.print("o");
            
        }
        catch(MyEx e)
        {
            System.out.print("a");
        }
        finally
        {
            System.out.print("w");
            System.out.print("s");
        }
    }
    static void doRisky(String t) throws MyEx
    {
        System.out.print("t");
        System.out.print("h");
        if(t.equals("yes"))
            throw new MyEx();
    }
}
