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

public class Problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //takes no of trials
        System.out.println("enter t:");
        int t=s.nextInt();
        
       for(int k=1;k<=t;k++)
       {
           
        //takes l and r   
        System.out.println("enter l and r:");
        int l=s.nextInt();
        int r=s.nextInt();
        
        boolean p=false;
        outer:  for(int i=l;i<=r;i++)                   //  outer loop
                {                                       //             (pick pairs of no.'s bw l nd r)
                   for(int j=i+1;j<=r;j++)              //  inner loop
                   {
                      //checks whether lcm of selected pair is bw l nd r 
                      if(lcm(i,j)>=l&&lcm(i,j)<=r)         
                      {System.out.println(i+" "+j);p=true;break outer;}
                   }
                }
        //if none of the pairs has lcm bw l nd r, prints -1 -1
        if(p==false)System.out.println("-1 -1");
       }
    }
    
    //returns lcm of given two no.'s
    public static int lcm(int n1,int n2)
    {
        int min=Math.min(n1, n2);
        int max=Math.max(n1, n2);
        
        for(int i=max;;i+=max)
        {
            if(i%min==0)
            return i;
        }
    }
}
