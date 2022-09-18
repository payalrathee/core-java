
package telusko.basics;
import java.util.Scanner;

public class Fibonacci {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n:");
        int n=s.nextInt();
       
        //***************************************************************************************
        /* int[] a=new int[n];
        a[0]=1;a[1]=1;
        for (int i = 2; i < n; i++)                  //using arrays
        {
            a[i]=a[i-1]+a[i-2];
        }
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i]+",");   
        }
        System.out.println("\b"+ "");*/
        
        //**************************************************************************************
        
        Fibo f=new Fibo();
        for (int i = 1; i <=n; i++)
        {
            System.out.print(f.fibo(i)+",");
        }
        System.out.println("\b"+ "");
    }
 }
 class Fibo
 {
     int fibo(int x)
    {
        
        if(x==1||x==2)
            return 1;
        else 
            return (fibo(x-2)+fibo(x-1));
    }
    
 }