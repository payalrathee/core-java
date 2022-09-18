package guessGame;

public class Player {
    private String name;
    private int number;
    public Player(){}
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
    public int guessNumber()
    {
        number=(int)(Math.random()*10);
        return number;
    }
}
