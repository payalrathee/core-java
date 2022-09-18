/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopspractice;

/**
 *
 * @author Payal
 */
public class Equilateral extends Triangle{
    //class variables
    private static int count=1; 
    
    //constructor
    public Equilateral(String colour,double a)
    {
        super("Equilateral Triangle"+count,colour,3,3,a,a,a);
        count++;
    }
    
    //methods
    @Override
    public double area()
    {
        return Double.parseDouble(String.format("%.2f",(Math.sqrt(3)/4)*getSide1()));
    }
    @Override
    public double perimeter()
    {
        return Double.parseDouble(String.format("%.2f",3*getSide1()));
    }
    
}
