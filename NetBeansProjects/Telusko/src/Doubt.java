/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal
 */
public class Doubt {
    public static void main(String[] args) {
        A a=new A(2);
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.d);
        System.out.println(a.s);
        System.out.println(a.b);
    }
}
 class A
{
    int n1;
    int n2;
    double d;
    String s;
    boolean b;
    
    public A(int n)
    {
        n1=n;
     }
            
}