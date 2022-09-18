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
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        int f=1;
        for(int i=n;i>0;i--)
        {
            f=f*i;
        }
        System.out.println(f);
    }
    
}
