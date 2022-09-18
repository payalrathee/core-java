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
public class MaxSal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String> a=new ArrayList<String>();
        
        for(int i=0;i<n;i++)
        {
           a.add(s.next());
        }
        sort(a);
        
       while(a.size()!=1)
       {
           if((a.get(0)+"").compareTo(a.get(1)+"")==0)
           {
               int x=(int)(Integer.parseInt(a.get(1))*Math.pow(10, a.get(0).length())+Integer.parseInt(a.get(0)));
               int y=(int)(Integer.parseInt(a.get(0))*Math.pow(10, a.get(1).length())+Integer.parseInt(a.get(1)));
               if(x>y)
                   a.set(1,x+"");
               else
                   a.set(1,y+"");
               
               a.remove(0);
           }
           else
           {
              a.set(1, (Integer.parseInt(a.get(1))*Math.pow(10, a.get(0).length())+Integer.parseInt(a.get(0)))+"");
              a.remove(0);
           }
       }
        System.out.println(a);
    }
    
    static ArrayList<String> sort(ArrayList<String> a)
    {
        for(int i=0;i<a.size();i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
                if((a.get(i)).compareTo(a.get(j))>0)
                {
                    String temp=a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
       return a; 
    }
}
