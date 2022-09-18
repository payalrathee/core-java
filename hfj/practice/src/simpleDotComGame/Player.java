package simpleDotComGame;

import java.util.Scanner;

public class Player {
    private String name;
    private int number;
    private int noOfGuesses;

    public Player(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getNumber()
    {
        return number;
    }
    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
    public int makeGuess()
    {
        noOfGuesses++;
        System.out.println("Make a guess:");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        return number;
    }
}
