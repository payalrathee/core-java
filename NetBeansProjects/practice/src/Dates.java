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
public class Dates {
    public static void main(String[] args) {
        
        //FOR CURRENT DATE AND TIME
        Date d=new Date();
        System.out.println(String.format("Current date and time: %tc",d));
        System.out.println(String.format("Current time: %tr",d));
        System.out.println(String.format("Current day: %tA",d));
        System.out.println(String.format("Current month: %tB",d));
        System.out.println(String.format("Current date: %td",d));
        System.out.println(String.format("Current  time and date: %tr\n%<td/%<tB\n%<tA",d));
        
        //CALENDAR
        Calendar c=Calendar.getInstance();
        c.set(c.HOUR,1);
        c.set(c.MINUTE, 42);
        c.set(c.DATE, 29);
        c.set(c.MONTH, 6);
        c.set(c.YEAR, 2020);
        
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        //System.out.println(c.get(c.DAY));
        
        c.add(c.MINUTE, 20);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        
        c.add(c.HOUR, 2);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        
        c.add(c.DATE,1);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        
        c.add(c.MONTH,10);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        
        c.add(c.YEAR, 10);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        
        c.roll(c.MINUTE,61 );
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        System.out.println("");
        
        
        c.roll(c.HOUR, 18);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        System.out.println("");
        
        c.roll(c.DATE, 5);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        System.out.println("");
        
        c.roll(c.MONTH,12);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        System.out.println("");
        
        c.roll(c.YEAR, 100);
        System.out.println(c.get(c.HOUR));
        System.out.println(c.get(c.MINUTE));
        System.out.println(c.get(c.MILLISECOND));
        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.getTimeInMillis());
        
        Calendar c1=Calendar.getInstance();
        c1.set(2020,6,29,1,20);
        System.out.println(c1.get(c.HOUR));
        System.out.println(c1.get(c.MINUTE));
        System.out.println(c1.get(c.MILLISECOND));
        System.out.println(c1.get(c.DATE));
        System.out.println(c1.get(c.MONTH));
        System.out.println(c1.get(c.YEAR));
        System.out.println(c1.getTimeInMillis());
        
        System.out.println(String.format("%tc",c1));
    }
}
