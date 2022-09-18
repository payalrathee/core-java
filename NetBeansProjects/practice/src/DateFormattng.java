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
public class DateFormattng {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2020,6,30,11,53);
        System.out.println("Remaining Thursdays in the year 2020: ");
        
        while(true)
        {
            c.add(c.DATE,7);
            if(c.get(c.YEAR)!=2020) break;
            System.out.println(String.format("%tc",c));
            
            
        }
         Calendar c1=Calendar.getInstance();
         c1.set(2021,7,3,2,20);
         
         int y1=c.get(c.YEAR);
         int y2=c1.get(c1.YEAR);
         System.out.println("Year gap: "+(y2-y1));
         int m1=c.get(c.MONTH);
         int m2=c1.get(c1.MONTH);
         if(y1!=y2)
         System.out.println("Month gap: "+(m2+11-m1+(y2-y1-1)*12));
         else
            System.out.println(Math.abs(m2-m1));    
        
        
    }
}
