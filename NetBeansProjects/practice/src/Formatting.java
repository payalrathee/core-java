/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal
 */
public class Formatting {
    public static void main(String[] args) {
        System.out.println(String.format("%,.2f",7346378.748874));
        System.out.println(String.format("%,13.2f",7346378.748874));
        System.out.println(String.format("%,.3f",7346378.748874));
        System.out.println(String.format("%.0f",7346378.748874));
        System.out.println(String.format("%,3.2f",78.745));
        System.out.println(String.format("%,d",65734637));
        System.out.println(String.format("%,d",734637874));
        System.out.println(String.format("%b",1));
        System.out.println(String.format("%c",65));
        
        //convert from decimal to ocatl hexa n binary
        System.out.println(String.format("%X",10));
        System.out.println(String.format("%o",12));
        
        //convert from hexa binary n octal to decimal
        System.out.println(String.format("%d",0x12));
        System.out.println(String.format("%d",0b111));
        System.out.println(String.format("%d",014));
    }
}
