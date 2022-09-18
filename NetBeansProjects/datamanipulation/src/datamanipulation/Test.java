/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datamanipulation;
import java.lang.Math;
import java.util.Scanner;

class Rawdata
{
    double mean(double[] x)
    {
      double add=0;
      int l=x.length;
      for(int i=0;i<l;i++)
      {
          add=add+x[i];
      }
      return(add/l);
    }
    
    void sort(double[] x)
    {
        int l=x.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;i<l;i++)
            {
                if(x[i]>x[j])
                {
                   double temp=x[i];
                   x[i]=x[j];
                   x[j]=temp;
                }
            }
        }
        
    }
    
    double median(double[] x)
    {
        sort(x);
        int l=x.length;
        if(l%2!=0)
        return(x[l/2+1]);
        else
        return((x[l/2]+x[l/2+1])/2);    
        
    }
    
    double[] freq(double[] x)
    {
        int l=x.length;
        double[] count =new double[l];
   outer:     for(int i=0;i<l;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(x[i]==x[j])
                {
                   count[i]=count[j];   
                    continue outer;
                }   
            }
            for(int k=i;k<l;k++)
            {
                if(x[i]==x[k])
                    count[i]++;
            }
        }
   return count;
    }
    
    double mode(double[] x)
    {
        int l=x.length;
        double count[]=freq(x);
        sort(count);
        return(x[l-1]);
    }
}

public class Test
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
                Rawdata r=new Rawdata();
		System.out.println("give the number of entries:");
		int n=s.nextInt();
		double[] a=new double[n];
		System.out.println("enter "+n+" numbers: ");
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextDouble();
		}
                System.out.println("The mean is: "+r.mean(a));
                System.out.println("The median is: "+r.median(a));
                System.out.println("The mode is: "+r.mode(a));
	}
}

