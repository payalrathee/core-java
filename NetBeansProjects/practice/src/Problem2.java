/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal
 */
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int count=0;
            int n=s.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            
            for(int j=0;j<n;j++)
            {
                a[j]=s.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                b[j]=s.nextInt();
            }
            
            int amin=min(a);
            int bmin=min(b);
            
            
            for(int j=0;j<n;j++)
            {
                while(a[j]>amin||b[j]>bmin)
                {   
                    count++;
                   if(a[j]>amin&&b[j]>bmin)
                   {
                     a[j]--;b[j]--;
                   }
                   else if(a[j]>amin)
                       a[j]--;
                   else
                       b[j]--;
                }
            }
            
            System.out.println(count); 
        }
    }
    static int min(int[] a)
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
}
