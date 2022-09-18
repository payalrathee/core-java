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
public class Rhombus extends Parallelogram {
    
    //class members
    private static int count=1;
    
    //constructor
    public Rhombus(String colour,double x,double h)
    {
        super(colour,x,x,h);
        setShapeName("Rhombus"+count);
        count++;
    }
    
}
