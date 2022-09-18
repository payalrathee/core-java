/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.numbers;
import java.util.Scanner;
/**
 *
 * @author vishal
 */
public class PrimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isprime=true;
        System.out.println("enter the no:");
        int n=s.nextInt();
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isprime=false;break;
            }
        }
       if(n==1)
       System.out.println("unique no");
       else if(isprime)
             System.out.println(" Prime no");
             else  
             System.out.println("not a Prime no");
       
       //***************************************************************************************************

     //TO FIND ALL PRIME NO WITHIN A RANGE
       int count=0; 
       
        System.out.println("enter the range ___-___:");
        int r1=s.nextInt();
        int r2=s.nextInt();
        for(int i=r1;i<=r2;i++)
        {
            if(i<2)
                isprime=false;
            else
            {     
            isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isprime=false;break;
                }
            }
            }
            if(isprime)
            {
                System.out.print(i+",");count++;    
            }
        }
        System.out.println("\b\nTotal prime no within the given range : "+count);

    }
}



