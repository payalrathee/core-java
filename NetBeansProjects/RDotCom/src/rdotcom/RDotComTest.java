/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdotcom;
import java.util.Scanner;
import java.util.*;
import java.io.*;


/**
 *
 * @author vishal
 */
class DotCom
{
    String name;
    ArrayList<String> loc=new ArrayList<String>();
    
    void setLoc(ArrayList<String> s)
    {
      for(String i:s)
      {
          loc.add(i);
      }
    }
    void setName(String s)
    {
        name=s;
    }
    String check(String s)
    {
        String res="Miss!";
        if(loc.indexOf(s)>=0)
        {
            loc.remove(s);
            if(loc.isEmpty())
            res="Kill!!";
            else
            res="Hit!";    
        }
        return res;
    }
}
 class GameHelper {

  private static final String alphabet = "abcdefg";
  private int gridLength = 7;
  private int gridSize = 49;
  private int [] grid = new int[gridSize];
  private int comCount = 0;


  public String getUserInput(String prompt) {
     String inputLine = null;
     System.out.print(prompt + "  ");
     try {
       BufferedReader is = new BufferedReader(
	 new InputStreamReader(System.in));
       inputLine = is.readLine();
       if (inputLine.length() == 0 )  return null; 
     } catch (IOException e) {
       System.out.println("IOException: " + e);
     }
     return inputLine.toLowerCase();
  }

  
  
 public ArrayList<String> placeDotCom(int comSize) {                 // line 19
    ArrayList<String> alphaCells = new ArrayList<String>();
    String [] alphacoords = new String [comSize];      // holds 'f6' type coords
    String temp = null;                                // temporary String for concat
    int [] coords = new int[comSize];                  // current candidate coords
    int attempts = 0;                                  // current attempts counter
    boolean success = false;                           // flag = found a good location ?
    int location = 0;                                  // current starting location
    
    comCount++;                                        // nth dot com to place
    int incr = 1;                                      // set horizontal increment
    if ((comCount % 2) == 1) {                         // if odd dot com  (place vertically)
      incr = gridLength;                               // set vertical increment
    }

    while ( !success & attempts++ < 200 ) {             // main search loop  (32)
	location = (int) (Math.random() * gridSize);      // get random starting point
        //System.out.print(" try " + location);
	int x = 0;                                        // nth position in dotcom to place
        success = true;                                 // assume success
        while (success && x < comSize) {                // look for adjacent unused spots
          if (grid[location] == 0) {                    // if not already used
             coords[x++] = location;                    // save location
             location += incr;                          // try 'next' adjacent
             if (location >= gridSize){                 // out of bounds - 'bottom'
               success = false;                         // failure
             }
             if (x>0 & (location % gridLength == 0)) {  // out of bounds - right edge
               success = false;                         // failure
             }
          } else {                                      // found already used location
              // System.out.print(" used " + location);  
              success = false;                          // failure
          }
        }
    }                                                   // end while

    int x = 0;                                          // turn good location into alpha coords
    int row = 0;
    int column = 0;
    // System.out.println("\n");
    while (x < comSize) {
      grid[coords[x]] = 1;                              // mark master grid pts. as 'used'
      row = (int) (coords[x] / gridLength);             // get row value
      column = coords[x] % gridLength;                  // get numeric column value
      temp = String.valueOf(alphabet.charAt(column));   // convert to alpha
      
      alphaCells.add(temp.concat(Integer.toString(row)));
      x++;

      // System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
      
    }
    // System.out.println("\n");
    
    return alphaCells;
   }
}


class Game
{
    GameHelper h=new GameHelper();
  Scanner s=new Scanner(System.in);
   ArrayList<DotCom> d=new ArrayList<DotCom>();
  DotCom one=new DotCom();
  DotCom two=new DotCom();
  DotCom three=new DotCom();
 
  
  void setUp()
  {
      char j='A';
       d.add( one);
       d.add(two);
       d.add(three);
      System.out.println("The game starts now!");
      System.out.println("Rules for the game:\nGuess a location.\nIf you hit the target:+2\nIf you miss the target:-1\nIf you kill the target:+5\nKill all the targets and you win!!");
      System.out.println("Try to kill all the targets in fewest number of guesses.");
      System.out.println("Enjoy:)!!");
      
      for(DotCom i:d)
      {
          i.setLoc(h.placeDotCom(3));
          i.setName(j+"");
          j++;
      }
      
   }
  void start()
  {
     int score=0;
    
     outer:   while(!(d.isEmpty()))
      {
        
          String result="Miss!";
          System.out.println("Enter your guess:");
          String guess=s.nextLine();
          
          
          
          int k=-1;
     inner: for(DotCom i:d)
          {  
              String r=i.check(guess);
              k++;
              if(r.equals("Miss!"))
                  continue inner;
              else if(r.equals("Hit!"))
              {result="Hit!"; break inner;}
              else
              {result="Bravo! You killed "+d.get(k).name;d.remove(k);break inner;}
              
              
          }
          System.out.println(result);
          if(result.equals("Miss!")){ score--;}
          else if(result.equals("Hit!")){score=score+5;}
          else {score=score+10;}
          System.out.println("score till now:"+score);
         
      }
      System.out.println("Total score: "+score);
              
  }
}



public class RDotComTest {

    public static void main(String[] args) {
        Game g=new Game();
        g.setUp();
     /*  System.out.println(g.one.loc.get(0));
        System.out.println(g.one.loc.get(1));
        System.out.println(g.one.loc.get(2));          // just to know the location;)
        System.out.println(g.two.loc.get(0));
        System.out.println(g.two.loc.get(1));
        System.out.println(g.two.loc.get(2));
        System.out.println(g.three.loc.get(0));
        System.out.println(g.three.loc.get(1));
        System.out.println(g.three.loc.get(2));*/
        g.start();
       /* System.out.println((g.d.get(0)).name);
        System.out.println((g.d.get(1)).name);
        System.out.println((g.d.get(2)).name);        just for understanding concepts of arraylist.
        System.out.println(g.one.name);               ignore...
        System.out.println(g.one.loc.get(0));
        g.d.remove(g.three);
        System.out.println(g.three.name);             this will still show C
        System.out.println((g.d.get(2)).name);      but we can't access name from arraylist now coz this has been removed*/
    }
    
}
