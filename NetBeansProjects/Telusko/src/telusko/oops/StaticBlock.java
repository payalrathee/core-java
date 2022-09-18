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
public class StaticBlock {
    static String s="hello!";
    static
    {
       System.out.println("static1");                
    }                                             //first all the static blocks will execute in sequence 
    static                                        //and then main method will be executed
    {
        System.out.println("static2");
    }
    
    
    public static void main(String[] args) {
        System.out.println("main");
        Demo1 d=new Demo1();
        Demo2.disp();
        Demo2.disp();                         //static block will execute only the first time u use the class
    }
    static
    {
        System.out.println("static3");
    }
 }

class Demo1{
    static
    {
        System.out.println("staticb in demo1");
    }
    Demo1()
    {
        System.out.println("demo obj created!");
    }
}

class Demo2
{
    static
    {
        System.out.println("static in demo2");
    }
   static void disp()
    {
        System.out.println("disp in demo2");
    }
}