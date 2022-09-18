/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko;

/**
 *
 * @author vishal
 */
public class References {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a);
        int c=a.hashCode();    //this will save the hashcode in int type
        a=null;
        System.out.println(a+" "+c);
        A d=new A();
        StringBuffer name=new StringBuffer("Payal");
        d.disp(name);
        System.out.println(name);  //now this will print Pal bcz we changed the value stored in the object by accessing it through copy reference
    }
}
class A
{                                                 //  name
    String a;                                     //  |R|---->| O |
    void disp(StringBuffer s)                     //          | B | 
    {                                             //          | J |
        System.out.println("hi! "+s);             //          | E |
        s.delete(1, 3);                           //  (copy)  | C |
                                                  //  |R|---->| T |
    }                                             //  s
}