/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Payal Rathee
 */
import java.util.*;
 class TimeGap {
   
    //instance variables
    private Calendar time1;
    private Calendar time2;
    
    //constructor
    public TimeGap(Calendar c1,Calendar c2)
    {
        time1=c1;
        time2=c2;
    }
    
    //setters
    public void setTime1(Calendar c)
    {
        time1=c;
    }
    public void setTime2(Calendar c)
    {
        time2=c;
    }
    
    //getters
    public Calendar getTime1()
    {
        return time1;
    }
    public Calendar getTime2()
    {
        return time2;
    }
    
    //methods
    public int yearGap()
    {
        int y1=time1.get(time1.YEAR);
        int y2=time2.get(time2.YEAR);
        return y2-y1;
    }
    
    public int monthGap()
    {
        int m1=time1.get(time1.MONTH);
        int m2=time2.get(time2.MONTH);
        int yearGap=yearGap();
        if(yearGap==0)
            return Math.abs(m2-m1);
        else
            return (m2+1+11-m1+(yearGap-1)*12);
    }
}

public class TimeGapTest{
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter year(with base0),month,date,hour,minutes in respective order(all integers):");
        c1.set(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
        
        System.out.println("enter year(with base0),month,date,hour,minutes in respective order(all integers):");
        c2.set(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
        
        System.out.println();
        TimeGap t=new TimeGap(c1,c2);
        System.out.println("Year gap: "+t.yearGap());
        System.out.println("Month gap: "+t.monthGap());
    }

}