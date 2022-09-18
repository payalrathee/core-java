public class Phrasomatic {
    public static void main(String[] args) {
        String[] list1={"24/7", "multi-Tier", "30,000 foot", "B-to-B",
                "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
                "critical-path", "dynamic"};
        String[] list2={"empowered", "sticky", "value-added", "oriented", "centric",
                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
                "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] list3={"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
        int length1=list1.length;
        int length2=list2.length;
        int length3=list3.length;

        for(int i=0;i<5;i++)
        {
            int r1=(int)(Math.random()*length1);
            int r2=(int)(Math.random()*length2);
            int r3=(int)(Math.random()*length3);

            String word1=list1[r1];
            String word2=list2[r2];
            String word3=list3[r3];

            String phrase=word1+" "+word2+" "+word3;

            System.out.println("What we need is a "+phrase);
        }
    }
}
