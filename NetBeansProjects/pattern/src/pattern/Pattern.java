/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;
import java.util.Scanner;

/**
 *
 * @author vishal
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //                                 PATTERNS
        //                           *------------------*
        
        
        
        int n;
       System.out.println("Please enter the value of n: ");
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
     
       //*******************************************************************************************
       
     /* loop1:
       
       for(int i=1;i<=n;i++)
        {
             System.out.println("");                 //*
            for(int j=1;j<=n;j++)                    //* *
            {                                        //* * *
                if(i<j)                              //* * * * 
                    continue loop1;                  //* * * * *
                System.out.print("*");
            }
           
        }
       
       //*******************************************************************************************
       
        System.out.println();
       for(int i=1;i<=n;i++)
       {                                      
          for(int j=i;j<=n;j++)                        //1 2 3 4
          {                                            //2 3 4 1
              System.out.print(j+" ");                 //3 4 1 2
          }                                            //4 1 2 3
          for (int k =1; k<i; k++)                     
          {
              System.out.print(k+" ");
          }
          System.out.println(" ");
       }
       
       //******************************************************************************************
       
       for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <=i; j++)               //1
            {                                         //0 1
               if((i+j)%2==0)                         //1 0 1
                    System.out.print("1 ");           //0 1 o 1
               else                                   //1 0 1 0 1
                    System.out.print("0 ");
            }
            System.out.println(); 
        }
       
       //*****************************************************************************************
       
       for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j <= n; j++)               //p15
            {
                System.out.print("* ");  
            }
            System.out.println();
        }
       
       //******************************************************************************************
       
      for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j <= n; j++)
            {                                           //p16
                System.out.print(i+" ");  
            }
            System.out.println();
        }
       
       //*******************************************************************************************
       
       for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {                                        //p17
                System.out.print(j+" ");  
            }
            System.out.println();
        }
       
       //*******************************************************************************************
       
       for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j <= n; j++)
            {                                                 //p18
                System.out.print((char)(i+64)+" ");  
            }
            System.out.println();
        }
       
       //*****************************************************************************************
       
       for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char)(j+64)+" ");         //p19
            }
            System.out.println();
        }
       
       //*****************************************************************************************
       
       for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");                  //p20
            }
            System.out.println();
        }
       
       //******************************************************************************************
       
       for (int i = 1; i <= n; i++) 
        {
            for (int j = n; j >= i; j--)
            {
                System.out.print(j+" ");                 //p21
            }
            System.out.println();
        }
       
       //******************************************************************************************
       
       for (int i = n; i >= 1; i--) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print((char)(64+i)+" ");         //p22
            }
            System.out.println();
        }
       
       //*****************************************************************************************
       
       for (int i = 1; i <= n; i++) 
        {
            for (int j = n; j >= i; j--)
            {
                System.out.print((char)(64+j)+" ");         //p23
            }
            System.out.println();
        }*/
       
        
       
        
    
    } 
}
