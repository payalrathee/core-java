package shapePack;

abstract public class Triangle extends Shape{
    static final int noOfSides=3;
    int side1;
    int side2;
    int side3;
    Triangle(int color,int a,int b,int c)
    {
        super(color);
        side1=a;
        side2=b;
        side3=c;
    }
    void displaySides()
    {
        System.out.println("Sides are:"+side1+" "+" "+side2+" "+side3);
    }

}
