package simpleDotComGame;

import java.util.Scanner;

public class SimpleDotComGame {
    private SimpleDotCom com;
    private Player p;

    public void setUp()
    {
        System.out.println("............Simple DotCom Game...........");
        System.out.println("Guess the location to sink dot com");
        Scanner sc=new Scanner(System.in);
        System.out.println("What can we call you?");
        p=new Player(sc.next());
        com=new SimpleDotCom("Bob");
        int loc=(int)(Math.random()*5);
        com.setLocation(loc);
    }

    public void start()
    {
        System.out.println("The Game starts here...");
        boolean isAlive=true;

        while(isAlive)
        {
            System.out.println(p.getName()+", guess the loaction: ");
            p.makeGuess();
            String result=com.checkYourself(p.getNumber());
            if(result.equals("kill"))
            {
                isAlive=false;
            }
        }
    }
    public void showResult()
    {
        System.out.println("You sank "+com.getName()+" in "+p.getNoOfGuesses()+" guesses!");
    }
}
