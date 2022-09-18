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
public abstract class ThreeDShape extends Shape {
    private int noOfFaces;
    private int noOfEdges;
    
    //constructor
    public ThreeDShape(String name,String colour,int corners,int faces,int edges)
    {
        super(name,colour,corners);
        noOfFaces=faces;
        noOfEdges=edges;
    }
    
    //setters
    public void setFaces(int faces)
    {
        noOfFaces=faces;
    }
    public void setEdges(int edges)
    {
        noOfEdges=edges;
    }
    
    //getters
    public int getFaces()
    {
        return noOfFaces;
    }
    public int getEdges()
    {
        return noOfEdges;
    }
    
    //methods
    public abstract double volume();
    public abstract double cSA();
}
