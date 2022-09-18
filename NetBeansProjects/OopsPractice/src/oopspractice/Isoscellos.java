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
public class Isoscellos extends Triangle{
    
    //class variable
    private static int count=1;
    
    //constructor
    public Isoscellos(String name,String colour,double a,double b)
    {
        super("Isoscellos Triangle"+count,colour,3,3,a,a,b);
        count++;
    }
}
