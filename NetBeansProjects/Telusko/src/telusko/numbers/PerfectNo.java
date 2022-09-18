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
public class PerfectNo {
    public static void main(String[] args) {
        //perfect no: sum of all the factors is equal to the no itself
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        int r=0;
        for (int i=1;i<n;i++) 
        {
            if(n%i==0)
                r+=i;
        }
        
        if(r==n)
            System.out.println("Perfect no");
        else
            System.out.println("Not a perfect no");
    }
    
}
