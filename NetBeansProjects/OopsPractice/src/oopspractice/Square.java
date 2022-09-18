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
public class Square extends Parallelogram{
    
    //class variables
    private static int count=1;
    
    //constructor
    public Square(String colour,double x)
    {
        super(colour,x,x,x);
        setShapeName("Square"+count);
        count++;
    }
    
    
    
    
}
