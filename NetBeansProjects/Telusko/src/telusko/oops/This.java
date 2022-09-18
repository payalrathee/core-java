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
public class This {
    public static void main(String[] args) {
        
       Test1 t=new Test1(3,2);
       t.disp();
    }
}
class Test
{
    Test(int i)
    {
        System.out.println("super constr through"+i);
    }
}
class Test1 extends Test
{
    int a;
    public Test1(int i)
    {
        super(1);
        System.out.println("1 para");
    }
    public Test1(int a,int b)
    {
        this(1,2,3);
         this.a=a;
        System.out.println("2 para"+this.a);
       
    }
    Test1(int x,int y,int z)
    {
        super(2);
        System.out.println("3 para");
    }
    void disp()
    {
        System.out.println(a);
    }
    
}