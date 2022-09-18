/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.oops;

/**
 *
 * @author PR3
 */
public class CountingObj {
    public static void main(String[] args) {
        //program to find no of obj of a class.
        
        Disp d1=new Disp();
        Disp d2=new Disp();
        Disp d3=new Disp();
        Disp d4=new Disp();
        Disp d5=new Disp();
        System.out.println(Disp.n);
        System.out.println(d1.counter());
    }
    
}
class Disp
{
    static int n;
    Disp()
    {
        System.out.println("Your object is created!");
        n++;
    }
     int counter()
    {
        return n;
    }
}