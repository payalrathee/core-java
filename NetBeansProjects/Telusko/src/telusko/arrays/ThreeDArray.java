/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko.arrays;
import java.util.Random;
/**
 *
 * @author vishal
 */
public class ThreeDArray {
    public static void main(String[] args) {
        Random r=new Random();
        
        //METHOD : 1
        int[][][] a=new int[2][3][4];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                for (int k = 0; k < 4; k++)
                {
                   a[i][j][k]=r.nextInt(10);
                }
            }
        }
        
        for(int[][] i:a )
        {
            for(int[] j:i)
            {
                for(int k:j)
                    System.out.print(k+" ");
                System.out.print("    ");
            }
            System.out.println();
        }
        System.out.println();
        
        //**************************************************************************************
        
        //METHOD : 2
        
        int[][][] b=
        {
            {
                {1,2,3},{1,2,3}           //2*2*3
            },
            {
                {1,2,3},{1,2,3}   
            }
            
        };
        
        for(int[][] i:b)
        {
            for(int[] j:i)
            {
                for(int k:j)
                    System.out.print(k+" ");
                System.out.print("    ");
            }
            System.out.println();
        }
        System.out.println();
        
        //*********************************************************************************************
        
        //METHOD : 3
        
        int[][][] c=new int[2][][];
        c[0]=new int[3][];
        c[1]=new int[3][];
        
        c[0][0]=new int[4];
        c[0][1]=new int[4];
        c[0][2]=new int[4];
        
        c[1][0]=new int[4];
        c[1][1]=new int[4];
        c[1][2]=new int[4];
        
        
       
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                for (int k = 0; k < 4; k++)
                {
                   c[i][j][k]=r.nextInt(10);
                }
            }
        }
        
        for(int[][] i:c )
        {
            for(int[] j:i)
            {
                for(int k:j)
                    System.out.print(k+" ");
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}
