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
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        
        for(int i=0;i<t;i++)
        {
            boolean p=true;
            int n=s.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=s.nextInt();
            }
            sort(a);
            for(int j=0;j<n-1;j++)
            {
                if(Math.abs(a[j+1]-a[j])>1)
                {p=false;break;}
            }
            
            if(p==true)System.out.println("Yes");
            else System.out.println("No");
        }
       
    }
    static int[] sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[i])
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
            }
        }
        return a;
    }
}
