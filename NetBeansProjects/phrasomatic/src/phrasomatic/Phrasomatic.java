/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrasomatic;
import java.lang.String;
import java.lang.Math;
/**
 *
 * @author vishal
 */
public class Phrasomatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] s1={"24/7","dynamic","web-based","pervasive","smart","win-win","front-end","multi-tier","30,000-foot","six-sigma"};
        String[] s2={"empowered","sticky","value-added","distributed","oriented","centric","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
        String[] s3={"process","tipping-point","solution","architecture","core-competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
        int a=s1.length;
        int b=s2.length; 
        int c=s3.length; 
        int r1= (int)(Math.random()*a);
        int r2= (int)(Math.random()*b);
        int r3= (int)(Math.random()*c);
        System.out.println(s1[r1]+" "+s2[r2]+" "+s3[r3]);
        // TODO code application logic here
    }
    
}
