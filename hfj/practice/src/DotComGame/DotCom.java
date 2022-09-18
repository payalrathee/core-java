package DotComGame;

import java.util.ArrayList;

public class DotCom {
    private String name;
    private ArrayList<String> locs;

    public DotCom(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public ArrayList<String> getLocs()
    {
        return locs;
    }
    public void setLocs(ArrayList<String> locs)
    {
        this.locs=locs;
    }
    public String checkYourself(String userGuess)
    {
        String result="miss";

        int loc=locs.indexOf(userGuess);
        if(loc>=0)
        {
            locs.remove(loc);
            result="hit";
        }
        if(locs.isEmpty())
            result="kill";
        return result;
    }
}
