/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopspractice;

/**
 *
 * @author Payal Rathee
 */
public abstract class Quadrilateral extends TwoDShape {
    
    //instance variables
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    
    //constructors
    public Quadrilateral(String name,String colour,int corners,int sides,double s1,double s2,double s3,double s4)
    {
        super(name,colour,corners,sides);
        side1=s1;
        side2=s2;
        side3=s3;
        side4=s4;
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
     public void setSide4(double s4)
    {
        side4=s4;
    }
     
     //getters
      public double getSide1()
    {
        return side1;
    }
      public double getSide2()
    {
        return side1;
    }
      public double setSide3()
    {
        return side3;
    }
      public double getSide4()
    {
        return side1;
    }
      
      //methods
      @Override
      public double perimeter()
      {
          return side1+side2+side3+side4;
      }
}
