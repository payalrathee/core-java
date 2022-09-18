/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author vishal
 */
class Rect
{
    int a,b;
    Rect(int x,int y)
    {
        a=x;b=y;
    }
    int area()
    {
        return(a*b);
    }
    int peri()
    {
        return (2*(a+b));
    }
         
}
class Tri
{
    float a,b,c;
    Tri(float x,float y,float z)
    {
        a=x;b=y;c=z;
    }
    float area()
    {
        float s=(a+b+c)/2;
        return( (float)(Math.sqrt(s*(s-a)*(s-b)*(s-c))) );
    }
    int peri()
    {
        return(  (int)(a+b+c)  );
    }
}
 class Circle
{
    final float pi=3.14f;
    float r;
    Circle(float x)
    {
        r=x;
    }
    float area()
    {
        return(pi*r*r);
    }
    float peri()
    {
        return(2*pi*r);
    }
}
 class D
{
    static void disp()
    {
        System.out.println("Enter the required data: ");
    }
}

 public class Multiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        D.disp();
        Scanner s=new Scanner(System.in);
        System.out.println("enter dimensions of the rectangle:");
        Rect r=new Rect(s.nextInt(),s.nextInt());
        System.out.println("Area of the rectangle is: "+r.area()+"\nPerimeter of the rectangle is: "+r.peri());
        
        System.out.println("enter dimensions of the Triangle:");
        Tri t=new Tri(s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println("Area of the triangle is: "+t.area()+"\nPerimeter of the triangle is: "+t.peri());
        
        System.out.println("enter dimensions of the circle:");
        Circle c=new Circle(s.nextInt());
        System.out.println("Area of the circle is:"+c.area()+"\nPerimeter of the circle is:"+c.peri());
    }
    
}
