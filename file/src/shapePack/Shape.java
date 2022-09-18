package shapePack;

abstract public class Shape {
    int color;
    static final int r=1;
    static final int g=2;
    static final int b=3;
    Shape(int color)
    {
        this.color=color;
    }
    void displayColor()
    {
        System.out.println("Color of the shape is: "+color);
    }
    abstract void perimeter();
    abstract void area();
    abstract void displaySides();
    abstract void displayName();
}
