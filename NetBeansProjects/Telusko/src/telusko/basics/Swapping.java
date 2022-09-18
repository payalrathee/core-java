package telusko.basics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author vishal
 */
public class Swapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no.'s a=__ and b=__:");
        int a=s.nextInt();
        int b=s.nextInt();
    
        /*  int c=a;
         a=b;
         b=c;
        */
         
         //**********************************************************************************
         
       /*  a=a+b;
         b=a-b;
         a=a-b;*/
         
         //**********************************************************************************
         
         /*a=a^b;
         b=a^b;
         a=a^b;*/
               
        //*************************************************************************************
        
         a=a+b-(b=a);
         System.out.println("a= "+a);
         System.out.println("b= "+b);
    }
    
}
  