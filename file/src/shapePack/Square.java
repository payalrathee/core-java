package shapePack;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Square extends Quadrilateral implements Drawable,Cloneable{
    static final String name="Square";
    Square(int color,int a)
    {
        super(color,a,a,a,a);
    }
    void perimeter()
    {
        int perimeter=side1*4;
        System.out.println("Perimeter is:"+perimeter);
    }
    void area()
    {
        int area=side1*side1;
        System.out.println("Area is: "+area);
    }
    void displayName()
    {
        System.out.println(name);
    }
    public void draw()
    {
        new Frame(){
            public void paint(Graphics g)
            {
                if(color==1)
                    g.setColor(Color.red);
                else if(color==2)
                    g.setColor(Color.green);
                else
                    g.setColor(Color.blue);
                g.fillRect(100,100,side1,side2);
            }
            public void setVisible(boolean b)
            {
                super.setVisible(b);
                setSize(500,500);
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }.setVisible(true);
    }
}
