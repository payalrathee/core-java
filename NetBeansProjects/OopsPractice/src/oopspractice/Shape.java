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
public abstract class Shape {
    
    //instance variables
    private String shapeName;
    private String shapeColour;
    private int shapeCorners;
    
    //constructors
    public Shape()
    {
        shapeColour="black";
    }
    
    public Shape(String name,String colour,int corners)
    {
        shapeName=name;
        shapeColour=colour;
        shapeCorners=corners;
    }
    
    //setters
    public void setShapeName(String name)
    {
        shapeName=name;
    }
    public void setShapeColour(String colour)
    {
        shapeColour=colour;
    }
    public void setShapeCorners(int corners)
    {
        shapeCorners=corners;
    }
    
    //getters
    public String getShapeName()
    {
        return shapeName;
    }
    public String getShapeColour(String colour)
    {
        return shapeColour;
    }
    public int getShapeCorners()
    {
        return shapeCorners;
    }
    
    
    //methods
    public void changeColour(String colour)
    {
        shapeColour=colour;
    }
    public abstract double perimeter();
    public abstract double area();
    
}
