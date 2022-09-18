/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.basics;
import java.util.Scanner;
/**
 *
 * @author vishal
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        
       if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
       
        
        /*String res="odd";
        for(int i=0;i<=n;i+=2)
        {
            if(i==n)
               res="even";
        }
        System.out.println(res);*/
    }
    
}
