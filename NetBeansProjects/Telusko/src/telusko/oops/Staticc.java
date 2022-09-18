/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.oops;

/**
 *
 * @author vishal
 */
public class Staticc {
    int n1;
    static int n2;
    static void disp(String s)
    {
        System.out.println(s);
    }    
}

class A
{
    public static void main(String[] args) {
        Staticc s=new Staticc();
        Staticc r=new Staticc();
        s.n1=2;   //non-static 
       // s.n2=2;   //static
        System.out.println(r.n1);           //this will print 0 
        System.out.println(r.n2);           //this will print 2 cos n2 is changed through obj s
        System.out.println(s.n2);
        Staticc.n2=3;                           //change in static va is reflected in all the obj
        System.out.println(s.n2);
        s.n2=4;
        System.out.println(Staticc.n2);
        s.disp("hi");
        Staticc.disp("hi");
    }
    static void show()
    {
        System.out.println("hello!");
    }
}
