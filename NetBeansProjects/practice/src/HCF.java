/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Payal
 */

import java.util.*;
public class HCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two no: ");
        int n1=s.nextInt();
        int n2=s.nextInt();
        
        int min=Math.min(n1, n2);
        int max=Math.max(n1, n2);
        ArrayList<Integer> f=factors(min);
        for(int i=f.size()-1;i>=0;i--)
        {
            if(max%f.get(i)==0)
            {System.out.println(f.get(i));break;}
        }
        
        
    }
    public static ArrayList<Integer> factors(int n)
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                a.add(i);
        }
        return a;
    }
   
}
