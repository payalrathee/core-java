package DotComGame;

import java.util.Scanner;

public class Player {
    private String name;
    private String guess;
    private int noOfGuesses;

    public Player(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public String getGuess()
    {
        return guess;
    }
    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
    public String makeGuess()
    {
        noOfGuesses++;
        System.out.println("Make your guess:");
        Scanner sc=new Scanner(System.in);
        guess=sc.next();
        return guess;
    }
}
