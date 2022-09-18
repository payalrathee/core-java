package DotComGame;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComBust {
    private Player p;
    private ArrayList<DotCom> dotComs;

    public void setUp()
    {
        System.out.println("................DotCom Game................");
        System.out.println("Sink the dotComs with as fewer guesses as possible.");

        Scanner sc=new Scanner(System.in);
        System.out.println("What can we call you?");
        p=new Player(sc.next());

        dotComs=new ArrayList<DotCom>();
        for(int i=0;i<3;i++)
        {
            DotCom com=new DotCom("Bob"+i);
            com.setLocs(GameHelper.placeDotCom(3));
            dotComs.add(com);
            System.out.println(com.getLocs());
        }
    }
    public void startGame()
    {
        System.out.println("The Game begins here...");
        System.out.println(p.getName()+", guess the locations");
        boolean isAlive=true;
        while(isAlive)
        {
            p.makeGuess();
            for(DotCom d:dotComs)
            {
                String result=d.checkYourself(p.getGuess());
                if(result.equals("hit"))
                {
                    System.out.println(d.getName()+" is hit.");
                    break;
                }
                if(result.equals("kill"))
                {
                    System.out.println(d.getName()+" is killed.");
                    dotComs.remove(d);
                    break;
                }
            }
            if(dotComs.isEmpty())
                isAlive=false;
        }
    }
    public void showResult()
    {
        System.out.println("You took "+p.getNoOfGuesses()+" guesses to sink all the dotComs");
    }
}
