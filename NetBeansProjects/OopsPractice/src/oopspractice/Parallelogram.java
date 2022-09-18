/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopspractice;

/**
 *
 * @author vishal
 */
public class Parallelogram extends Quadrilateral{
    
    //class variables
    private static int count=1;
    
    //instance variable
    private double height;
    
    //constructors
    public Parallelogram(String colour,double x,double y,double h)
    {
        super("Parallelogram"+count,colour,4,4,x,y,x,y);
        height=h;
        count++;
    }
    
    //setter
    public void setHeight(double h)
    {
       height=h; 
    }
    
    //getter
    public double getHeight()
    {
        return height;
    }
    
    //methods
    @Override
    public double area()
    {
        return Double.parseDouble(String.format("%.2f",getSide1()*height));
    }
    
}
