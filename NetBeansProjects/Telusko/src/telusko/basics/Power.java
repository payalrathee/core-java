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
public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        System.out.println("enter the power:");
        int p=s.nextInt();
        int res=1;
        for(int i=1;i<=p;i++)
        {
            res=res*n;
        }
        System.out.println(res);
    }
    
}
