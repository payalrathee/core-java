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
public class Scalar extends Triangle{
    
    //class variables
    private static int count=1;
    
    //constructor
    public Scalar(String colour,double a,double b,double c)
    {
        super("Scalar Triangle"+count,colour,3,3,a,b,c);
        count++;
    }
}
