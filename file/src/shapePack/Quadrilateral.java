package shapePack;

abstract public class Quadrilateral extends Shape{
    static final int noOfSides=4;
    int side1;
    int side2;
    int side3;
    int side4;

    Quadrilateral(int color,int a,int b,int c,int d)
    {
        super(color);
        side1=a;
        side2=b;
        side3=c;
        side4=d;
    }
     void displaySides()
     {
         System.out.println("Sides are:"+side1+" "+" "+side2+" "+side3+" "+side4);
     }
}
