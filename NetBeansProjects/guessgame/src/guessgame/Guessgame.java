/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;
import java.lang.Math;

/**
 *
 * @author vishal
 */
class Player
{
    int number;
    void guess()
    {
        number=(int)(Math.random()*10);
        System.out.println("Number guessed by me is: "+number);
    }
}

class Game
{
   int target;
   void startGame()
   {
       Player p1=new Player();
       Player p2=new Player();
       Player p3=new Player();
       System.out.println("Rules for the game:\nAll the players will guess a number between 0 to 9.\nIf the number matches with the target number,you win!!\notherwise make a guess again. ");
       System.out.println("Let's start the game!!");
      
       while(true)
       { 
       System.out.println("Player one: ");
       p1.guess();
       System.out.println("Player two: ");
       p2.guess();
       System.out.println("Player three: ");
       p3.guess();
       target=(int)(Math.random()*10);
       System.out.println("Number to be guessed was: "+target);
      
       if(p1.number==target||p2.number==target||p3.number==target)
       {     
             if(p1.number==target)
                System.out.println("Player1 guessed it right!");
             if(p2.number==target)
                System.out.println("Player2 guessed it right!");
             if(p3.number==target)
                System.out.println("Player3 guessed it right!");
             break;
       }
       else
       {
           System.out.println("None could guess it right.\nMake a guess again!");
       }
       }
   }
}

public class Guessgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game g=new Game();
        g.startGame();
    }
    
}
