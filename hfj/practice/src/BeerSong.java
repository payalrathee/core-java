public class BeerSong {
    public static void main(String[] args) {
        int noOfBottles=5;
        String word="bottles";

        while(noOfBottles>0)
        {
            if(noOfBottles==1)
                word="bottle";

            System.out.println(noOfBottles+" "+word+" of beer on the wall");
            System.out.println(noOfBottles+" "+word+" of beer");
            System.out.println("Take one down.");
            System.out.println("pass it around");
            noOfBottles--;

            if(noOfBottles==0)
                System.out.println("No more bottles of beer on the wall");
        }
    }
}
