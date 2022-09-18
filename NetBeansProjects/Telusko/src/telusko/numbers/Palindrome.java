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
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        int t=n,r=0;
        while(n>0)
        {
            int a=n%10;
            r=r*10+a;
            n=n/10;
        }
        if(t==r)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
    
}
