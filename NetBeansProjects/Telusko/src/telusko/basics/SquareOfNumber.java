/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.basics;
import java.util.Scanner;
/**
 *
 * @author Payal Rathee
 */
public class SquareOfNumber{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the number: ");
        int a=obj.nextInt();
        System.out.println("The square is "+(a*a));
        
    }
    
}
