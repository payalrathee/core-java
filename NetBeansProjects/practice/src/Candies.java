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
public class Candies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
       
        while(sum(a)!=n)
        {
            a.add(a.get(a.size()-1)+1);
            if(sum(a)<=n)
                continue;
            else
            { a.remove(a.size()-1);a.remove(a.size()-1);a.add(n-sum(a));}
                
         }
        System.out.println(a.size());
        for(int i:a)
        System.out.print(i+" ");
    }
    static int sum(ArrayList<Integer> a)
    {
        int s=0;
        for(int i:a)
        {
            s=s+i;
        }
        return s;
    }
}
