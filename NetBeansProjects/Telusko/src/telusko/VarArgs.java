/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko;
import telusko.References;
/**
 *
 * @author vishal
 */
public class VarArgs {
     static public void main(String ... args) {      //we can use varargs in main method too!!
        Disp d=new Disp();                           //secondly we can write static public instead of public static
        d.disp(2,3,4,3,2,3,4,5);
        d.disp(1); 
        d.disp(1,2);
        References r=new References();
                                                                                            
    }                                                                                       
                                                                                            
}                                                                                           
                                                                                           
class Disp                                                                                  
{                                                                                           
    void disp( int ... a)         //this method will work on variable parameters            
    {                                                                                       
        //here a is an array which stores all the arguments passed while calling the method 
        for(int i:a)                                                                        
            System.out.println(i);                                                          
    }                                                                                       
                                                                                            
    void disp(int a)                                                                         
    {
        System.out.println(a+"!");
    }
    
    void disp(int a,int b)
    {
        System.out.println(a+" "+b+"!!");
    }
    
}
// SO JVM FIRST MATCHES ARGUMENTS. IF METHOD WITH SAME NO OF ARGUMENTS IS FOUND THAT VERY METHOD IS EXECUTED
//ELSE IT MOVES TO VARARGS (WHEN UNABLE TO MATCH THE ARGUMENTS)