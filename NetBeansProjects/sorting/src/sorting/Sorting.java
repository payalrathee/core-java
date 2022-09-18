/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

/**
 *
 * @author vishal
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] s={"apple","banana","cherry","date","elderberry","fig","grapes"};
        for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                if(s[i].compareTo(s[j])>0)
                {    
                   String s2=s[j];
                   s[i]=s[j];
                   s[j]=s2;
                }
            }
        }
        System.out.println("words arranged lexographically:\n"+" "+s[0]+" "+s[1]+" "+s[2]+" "+s[3]+" "+s[4]+" "+s[5]+" "+s[6]);
        
        
    }
    
}
