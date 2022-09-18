package shapePack;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        shapes[0]=new Square(1,2);
        shapes[1]=new Rectangle(2,2,3);
        shapes[2]=new RightAngle(3,3,4,5);
        shapes[3]=new Equilateral(2,2);

        for(int i=0;i<4;i++)
        {
            shapes[i].displayName();
            shapes[i].displaySides();
            shapes[i].perimeter();
            shapes[i].area();

        }
        Drawable[] d=new Drawable[2];
        d[0]=new Rectangle(1,100,200);
        d[1]=new Square(2,50);
        d[0].draw();
        d[1].draw();

    }
}
