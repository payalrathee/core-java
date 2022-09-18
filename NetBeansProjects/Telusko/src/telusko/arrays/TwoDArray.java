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
public class TwoDArray {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Random r=new Random();
       
       //METHOD : 1 TO CREATE AN ARRAY AND ASSIGN VALUES
       //HERE WE ARE CREATING ARRAY(OF ARRAYS) OF SIZE 3 AND ASSIGNING IT ARRAYS OF SIZE 4 AS ITS MEMBERS(SIMULTANEOUSLY)
       //
       //           |R| --> | |  | |  | |  | |
       //   |R| --> |R| --> | |  | |  | |  | |
       //           |R| --> | |  | |  | |  | |
       //
       
       int[][] p=new int[3][4];
       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                p[i][j]=r.nextInt(50);
            }
        }
        
        for(int i[]:p)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        
        //*********************************************************************************
        
       //METHOD : 2
       //HERE WE ARE ASSIGNING THE VALUES AS WELL(ALL THREE TASKS IN ONE STATEMENT)
         int[][] q={
                      {1,2,3},
                      {4,5,6},           //but this needs to be done in asingle step (see below)
                      {7,8,9}
                   };
         
        //METHOD : 3
        //HERE WE ARE CREATING AN ARRAY(OF ARRAYS) OF SIZE 3 BUT WE ARE NOT INSTANTIATING THE ARRAYS WITHIN IT
        //THAT IS WE ARE ONLY CREATING THE REFERENCE VARIABLES FOR INNER ARRAYS
        //
        //          | | ---
        //  |R| --> | |    |-->THEY WILL CONTAIN ARRAYS
        //          | | ---   
        //
        int[][] k=new int[3][];
        k[0]=new int[2];        //HERE WE INITIALISE THE INNER ARRAYS
        k[1]=new int[2];        
        k[2]=new int[2];        
        
        //METHOD 3 IS ALSO USED TO CREATE JAGGED ARRAYS
        
        int[][] s=new int[3][];
        s[0]=new int[1];
        s[1]=new int[2];
        s[2]=new int[3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<=i;j++)
            {
               s[i][j]=r.nextInt(10);
            }
        }
        
        
        for(int[] i:s)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        
        
        
     /*   int[][] g=new int[3][];
        g[0]={1,2};
        int[] h;           //we can't do this!
        h={1,2,3};
       */ 
    }
    
}
