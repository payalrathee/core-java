/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.sequences;

/**
 *
 * @author vishal
 */
public class EscapeSequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1:payall\b");
        System.out.println("2:payal\frathee");
        System.out.println("3:payal\nrathee");
        System.out.println("4:payal\r4:rathee");
        System.out.println("5:payal\trathee");
        System.out.println("6:payal\\");
        System.out.println("7:payal\'s");
        System.out.println("8:payal's");
        System.out.println("9:\"payal\"");
        System.out.println("10:what?");
        System.out.println("XCfdh\0jhdjf");
        System.out.println("\uFFFF");
        System.out.println("\u266B");
        System.out.println("\u03A9");
        System.out.println("\u0041");
        System.out.println("A");
        System.out.println('A');
        System.out.println(0.6d);
        char z='\u266B';
        System.out.println(z);
        System.out.println("\ud83d\ude00"); 
        char c= '2'+'3';
        System.out.println(c); 
                
         System.out.println(1+2+"java"); 
        
        
            
        
        
    }
    
}
