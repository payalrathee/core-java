package shapePack;

public class RightAngle extends Triangle{
    static final String name="Right Angle Triangle";
    RightAngle(int color,int b,int p,int h)
    {
        super(color,b,p,h);
    }
    void perimeter()
    {
        int perimeter=side1+side2+side3;
        System.out.println("Perimeter is: "+perimeter);
    }
    void area()
    {
        double area=(side1*side2)/2.0;
        System.out.println("Area is: "+area);
    }
    void displayName()
    {
        System.out.println(name);
    }
}
