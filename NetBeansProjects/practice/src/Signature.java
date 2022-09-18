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
public class Signature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> points=new ArrayList<Integer>();
        ArrayList<Integer> el;
        for(int i=0;i<n;i++)
        {
            el=new ArrayList<Integer>();
            int x=s.nextInt();
            int y=s.nextInt();
            for(int j=x;j<=y;j++)
                el.add(j);
            a.add(el);
        }
        el=null;
        s.close();
        
        ArrayList<ArrayList<ArrayList<Integer>>> powerSet=subset(a);
        System.out.println(subset(a));
        
        System.out.println(inters(powerSet.get(powerSet.size()-1)));
        
        for(int i=a.size();i>=1;i--)
        {
            for(int j=powerSet.size()-1;j>0;j--)
            {
                if(powerSet.get(j).size()==i)
                {
                   ArrayList<Integer> com= inters(powerSet.get(j));
                   if(!com.isEmpty())
                   {
                       points.add(com.get(0));
                       for(ArrayList<Integer> k:powerSet.get(j))
                       {  a.remove(k);}
                       i=a.size()+1;
                       break;
                   }   
                }
            }
        }
        
        System.out.println(points.size());
        System.out.println(points);
       
    }
    
    static ArrayList<ArrayList<ArrayList<Integer>>> subset(ArrayList<ArrayList<Integer>> a)
    {
        ArrayList<ArrayList<ArrayList<Integer>>> powerSet=new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> subset; 
        
        int l=a.size();
        for(int i=0;i<Math.pow(2, l);i++)
        {
            String s=Integer.toString(i,2);
            subset=new ArrayList<ArrayList<Integer>>();  
            
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                 subset.add(a.get(l-1-(s.length()-j-1)));
            }
            powerSet.add(subset);
        }
        return powerSet;
    }
   
    
    static ArrayList<Integer> inters(ArrayList<ArrayList<Integer>> a)
    {
        ArrayList<Integer> inters=new ArrayList<Integer>();
        int l=a.size();
        if(l==1) inters=a.get(0);
        else{
        boolean p=false;
        boolean[] isCommon=new boolean[l-1];
        for(int i=0;i<a.get(0).size();i++)
        {
            for(int j=1;j<l;j++)
            {
                isCommon[j-1]=false;
               for(int k=0;k<a.get(j).size();k++)
               {
                   if(a.get(j).get(k)==a.get(0).get(i))
                   {isCommon[j-1]=true;break;}  
               }
            }
            for(int j=0;j<l-1;j++)
            {
                if(isCommon[j]==true)
                    p=true;
                else
                {
                    p=false;break;
                }
            }
            if(p==true) inters.add(a.get(0).get(i));
        }}
        return inters;
    }
}
