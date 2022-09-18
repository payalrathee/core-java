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
public class MaximumSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.next();
        }
        
        sort(a);
        for(int i=0;i<n;i++)
        {
            if(Integer.parseInt(a[i])!=0)
                System.out.print(a[i]);
        }
    }
    static String[] sort(String[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int x=Integer.parseInt(a[i].charAt(0)+"");
                int y=Integer.parseInt(a[j].charAt(0)+"");
                if(x<y)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
