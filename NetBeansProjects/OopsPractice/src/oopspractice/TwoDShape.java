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
public abstract class TwoDShape extends Shape
{
  //instance variables
  private int noOfSides;
  
  //constructor
  public TwoDShape(String name,String colour,int corners,int sides)
  {
      super(name,colour,corners);
      noOfSides=sides;
  }
  
  //setter
  public void setSides(int sides)
  {
      noOfSides=sides;
  }
  
  //getter
  public int getSides()
  {
      return noOfSides;
  }
  
 
}
