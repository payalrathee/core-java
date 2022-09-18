/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.oops;
import static java.lang.System.out;
import static telusko.oops.A.show;//to import static members of a class
import static telusko.oops.Staticc.n2;
/**
 *
 * @author vishal
 */
public class StaticImport {
    public static void main(String[] args) {
       out.println("hi"); 
       show();
       out.println(n2=365);
    }
}
