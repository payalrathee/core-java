
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal
 */
public class LCM {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.println("enter two no: ");
        int n1=s.nextInt();
        int n2=s.nextInt();
        
        int min=Math.min(n1, n2);
        int max=Math.max(n1, n2);
        
        for(int i=max;;i+=max)
        {
            if(i%min==0)
            {System.out.println(i);break;}
        }
        
        
    }
    
    
    }

