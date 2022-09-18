/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.arrays;
import java.util.Scanner;
/**
 *
 * @author vishal
 */
public class Matrix {
    public static void main(String[] args) {
        //MULTIPLICATION OF TWO MATRICES
        
        Scanner s = new Scanner(System.in);
       
        //MATRIX 1
        System.out.println("enter order of matrix 1:");
        int m1=s.nextInt();
        int n1=s.nextInt();
        int[][] a=new int[m1][n1];
        System.out.println("enter "+m1*n1+" no.'s:");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        
        //MATRIX 2
        System.out.println("enter order of matrix 2:");
        int m2=s.nextInt();
        int n2=s.nextInt();
        if(n1!=m2)
            System.out.println("You need follow the multiplication law for matrices!\n columns of matrix 1=rows of matrix 2"); 
        else
        {
            int[][] b=new int[m2][n2];
            System.out.println("enter "+m2*n2+" no.'s:");
            for(int i=0;i<m2;i++)
            {
               for(int j=0;j<n2;j++)
                 {
                    b[i][j]=s.nextInt();
                 }
            }
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<n2;j++)
                {
                    int r=0;
                    for(int k=0;k<n1;k++)
                    {
                        r+=a[i][k]*b[k][j];  
                    }
                    System.out.print(r+"    ");
                }
                System.out.println();
            }
            
        }
    
    
    }
    
}
