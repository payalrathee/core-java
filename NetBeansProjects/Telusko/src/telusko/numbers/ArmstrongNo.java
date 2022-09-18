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
public class ArmstrongNo {
    public static void main(String[] args) {
        //armstrong no: sum of cubes of all digits is equal to the no itself
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        int t=n,r=0;
        while(n>0)
        {
            int a=n%10;
            r=(int)(r+Math.pow(a, 3));
            n=n/10;
        }
        if(r==t)
            System.out.println("Armstrong");
        else
            System.out.println("not Armstrong");
    }
    
    
    
}
