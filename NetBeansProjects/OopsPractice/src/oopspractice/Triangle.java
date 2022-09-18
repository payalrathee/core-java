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
public abstract class Triangle extends TwoDShape {
   
    //instance variables
    private double side1;
    private double side2;
    private double side3;
    
    //constructor
    public Triangle(String name,String colour,int corners,int sides,double s1,double s2,double s3)
    {
        super(name,colour,corners,sides);
        side1=s1;
        side2=s2;
        side3=s3;
    }
    
    //setters
    public void setSide1(double s1)
    {
        side1=s1;
    }
     public void setSide2(double s2)
    {
        side2=s2;
    }
     public void setSide3(double s3)
    {
        side3=s3;
    }
     
    //getters
      public double getSide1()
    {
        return side1;
    }
      public double getSide2()
    {
        return side2;
    }
      public double getSide3()
    {
        return side1;
    }
    
    //methods  
    public double perimeter()
    {
        return Double.parseDouble(String.format("%.2f",side1+side2+side3));
    }
    public double area()
    {
        double s=(side1+side2+side3)/2;
        return Double.parseDouble(String.format("%.2f",Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))));
    }
    
}
