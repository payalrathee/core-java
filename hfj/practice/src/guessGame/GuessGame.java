package guessGame;

public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;
    int target;

    public void setUp()
    {
        p1=new Player("Nick");
        p2=new Player("Alan");
        p3=new Player("Den");

        target=(int)(Math.random()*10);
    }

    public void start(){
        System.out.println("The Game of Guess begins here...");
        System.out.println("Target Number : "+target);

        System.out.println(p1.getName()+" is guessing");
        System.out.println(p1.getName()+" guessed "+p1.guessNumber());
        System.out.println(p2.getName()+" is guessing");
        System.out.println(p2.getName()+" guessed "+p2.guessNumber());
        System.out.println(p3.getName()+" is guessing");
        System.out.println(p3.getName()+" guessed "+p3.guessNumber());
    }

    public void showResult()
    {
        boolean isP1=false;
        boolean isP2=false;
        boolean isP3=false;

        if(p1.getNumber()==target) isP1=true;
        if(p2.getNumber()==target) isP2=true;
        if(p3.getNumber()==target) isP3=true;

        if(isP1||isP2||isP3)
        {
            System.out.println("We have a winner!");
            System.out.println(p1.getName()+" guessed it right?"+isP1);
            System.out.println(p2.getName()+" guessed it right?"+isP2);
            System.out.println(p3.getName()+" guessed it right?"+isP3);
        }
        else
            System.out.println("Players wil have to try again!");
    }
}
