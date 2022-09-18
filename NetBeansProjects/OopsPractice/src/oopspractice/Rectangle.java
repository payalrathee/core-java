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
public class Rectangle extends Parallelogram{
    
    //class variable
    private static int count=1;
    
    //constructor
    public Rectangle(String colour,double x,double y)
    {
        super(colour,x,y,y);
        setShapeName("Rectangle"+count);
        count++;
    }
    
  
    
    
}
