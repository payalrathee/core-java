
package magic8;
import java.util.*;

public class Magic8 {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r=new Random();
        System.out.println("Ask any question from the Magic 8-ball and it will reveal your fortune!!");
        String ques=s.nextLine();
        
        int n=r.nextInt(20);
       if(n!=0) 
       {
           switch(n)
          {
                case 1: 
                System.out.println("It is certain.");
                break;
                    
                case 2: 
                System.out.println("As I see it, yes.");
                break;
                        
                case 3: 
                System.out.println("Concentrate and ask again.");
                break;
                            
                case 4: 
                System.out.println("Very doubtful.");
                break;
                                
                case 5: 
                System.out.println("You may rely on it.");
                break;
                                    
                case 6: 
                System.out.println("Signs point to yes.");
                break;
                                        
                case 7: 
                System.out.println("Reply hazy, try again.");
                break;
                                            
                case 8: 
                System.out.println("Don't count on it.");
                break;
                                                
                case 9: 
                System.out.println("Yes – definitely.");
                break;
                                                    
                case 10: 
                System.out.println("My reply is no");
                break;
                                                        
                case 11: 
                System.out.println("Ask again later.");
                break;
                                                            
                case 12: 
                System.out.println("It is decidedly so.");
                break;
                                                                
                case 13: 
                System.out.println("Outlook not so good");
                break;
                                                                    
                case 14: 
                System.out.println("Cannot predict now.");
                break;
                                                                        
                case 15: 
                System.out.println("Yes.");
                break;
                                                                            
                case 16: 
                System.out.println("My sources say no.");
                break;
                                                                                
                case 17: 
                System.out.println("Most likely.");
                break;
                                                                                    
                case 18: 
                System.out.println("Without a doubt.");
                break;
                                                                                        
                case 19: 
                System.out.println("Better not tell you now.");
                break;
                                                                                            
                case 20: 
                System.out.println(" Outlook good.");
                
                                                                                                
                
                
            }
       }      
        
    }
    
}
