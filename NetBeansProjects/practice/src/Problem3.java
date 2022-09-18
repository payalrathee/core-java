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
public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            String str=s.next();
            for(int j=0;j<str.length();j++)
            {
                a.add(Integer.parseInt(str.charAt(j)+""));
            }
        }
        
        sort(a);
        for(int i:a)
        {
            if(i!=0)
            System.out.print(i);
        }
    }
    
    static ArrayList<Integer> sort(ArrayList<Integer> a)
    {
        for(int i=0;i<a.size();i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
                if(a.get(i)<a.get(j))
                {
                   int temp=a.get(i);
                   a.set(i, a.get(j));
                   a.set(j,temp);
                }
            }
                
        }
        
        return a;
    }
}
