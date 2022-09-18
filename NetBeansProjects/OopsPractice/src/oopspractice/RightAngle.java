/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopspractice;

/**
 *
 * @author payal
 */
public class RightAngle extends Triangle{
    
    //class variables
    private static int count=1; 
    
    //constructor
    public RightAngle(String colour,double hieght,double base)
    {
        super("Right Angle Triangle"+count,colour,3,3,hieght,base,Math.hypot(hieght, base));
        count++;
    }
    
    //methods
    @Override
    public double area()
    {
        return Double.parseDouble(String.format("%.2f",0.5*getSide1()*getSide2()));
    }
}
