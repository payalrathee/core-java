package simpleDotComGame;

public class SimpleDotCom {
    private String name;
    private int location;
    private int noOfHits;

    public SimpleDotCom(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setLocation(int loc)
    {
        this.location=loc;
    }
    public String checkYourself(int userInput)
    {
        String result="miss";
        for(int i=location;i<location+3;i++)
        {
            if(userInput==i)
            {
                result="hit";
                noOfHits++;
            }
        }
        if(noOfHits==3)
            result="kill";
        System.out.println("It is a "+result);
        return result;
    }
}
