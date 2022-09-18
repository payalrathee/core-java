package shapePack;

public class Equilateral extends Triangle{
    static final String name="Equilateral Triangle";
    Equilateral(int color,int a)
    {
        super(color,a,a,a);
    }
    void perimeter()
    {
        int perimeter=3*side1;
        System.out.println("Perimeter is: "+perimeter);
    }
    void area()
    {
        double area=(Math.sqrt(3)*side1*side2)/4;
        System.out.println("Area is : "+area);
    }
    void displayName()
    {
        System.out.println(name);
    }
}
