package DotComGame;

import java.util.ArrayList;

public class abc {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("a");
        a.add("b");
        for(String s:a)
        {
            if(s.equals("a"))
                a.remove(s);
        }
        System.out.println(a);
    }
}
