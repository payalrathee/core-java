/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal
 */
import java.util.Scanner;
public class MoneyChange {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
    int m=s.nextInt();
    int count=(m/10);
    int r=m%10;
    count=count+(r/5);
    r=r%5;
    count=count+r;
        System.out.println(count);
    }
}
