package edotcomtest;


import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

class EDotCom
{
  private ArrayList<String> loc=new ArrayList<String>();
  void setLoc()
    {
       int r=(int)(Math.random()*5);
       loc.add(r+""   );
       loc.add(r+1+""  );
       loc.add(r+2+""  );
    }
  String check(String s)
   {
      String res="   Miss!"   ;
      if(loc.indexOf(s)>=0)
      {
          loc.remove(s);
          if(loc.isEmpty())
          res="   Kill!"   ;
          else 
           res="   Hit!"   ;
      }
       return res;  
   }
}




class EDotComTest
{
      public static void main(String[] a)
       {
          System.out.println("   The game begins!"   );
          Scanner s=new Scanner(System.in);
          EDotCom d=new EDotCom();
          d.setLoc();
          while(true)
          {
            System.out.println("   Enter your guess:"   );
            String guess=s.nextLine();
            String res=d.check(guess);
            System.out.println(res);
            if(res.equals("   Kill!"   ))
            break;
            else
            continue;
          }
       }
}