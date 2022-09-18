import java.util.ArrayList;
import java.util.Scanner;

public class add
{
    public static void main(String[] args) {
       //                        PRACTICE  NOTES
       //                    **--------------------**
       
        
        Scanner sc = new Scanner(System.in);

 /*    //*****************************************************************************************
        
        int i=0,j=1,k;
        k=i+j;
        System.out.printf("%d + %d = %d",i,j,k);  //we can use printf in java too!!
       
      //******************************************************************************************  
        
        byte a=1;
        //a=a*1.5;                                //this will generate an error
        a=(byte)(a*1.5);
        byte b=1;                                 //u see the diff bw shorthand operator and normal op
        b*=1.5;                                   //it always gives o/p with the type same as that of op1
        System.out.println("\n"+a+" "+b);         //basically it is used to do changes in a particular 
                                                 //variable without changing its type
        System.out.println(a+=5);                //a+="a"  -->error
        //shorthand operator explicitly casts the value to op1-type if possible otherwise -->error
       
//***************************************************************************************** 
        
        int x=5;
        int y=0b101;
        int z=0B100_00_00_00_00;
       // System.out.println("");
        System.out.println(x+"\n"+y+"\n"+z);
        int p=014;
        int q=0xC;
        int r=0b1100;
        System.out.println(p+"\n"+q+"\n"+r+"\n\u1101");     //this way we can retrieve data in decimal format from other formats
       
        //************************************************************************************************
        
        
        System.out.println(p++);
        System.out.println(++q);
        x=x++;                  //temp=x;
                                //x++;          this is what actually going on over here
                                //x=temp;
        System.out.println(x);     //it should give 7!!
        x=++x;
        System.out.println(x);
        
       //*******************************************************************************************************
        
        //BITWISE AND OR OPERATOR AND XOR
       int a=15;           //0 1 1 1 1
       int b=25;           //1 1 0 0 1
       
        int c=a&b;      //0 1 0 0 1  =9
        int d=a|b;      //1 1 1 1 1  =31
        int e=a^b;      //1 0 1 1 0  =22
        System.out.println(c+" "+d+" "+e);
        
        System.out.println((1>3)|(2>1));
        System.out.println(1|1);
        
        //*************************************************************************************************
        
        //LEFT SHIFT AND RIGHT SHIFT OPERATORS
        a=8;     //1 0 0 0
        System.out.println(a<<2); //1 0 0 0 o o  =32
        System.out.println(a>>2); //1 0          =2      shifted digits at the right will be lost
        
        //**********************************************************************************************
        
        //BOOLEAN
        boolean bol=false;           //if u use it without initialising =error
        System.out.println(bol);
                                       // int h;
         System.out.println(!bol);                              //System.out.println(h);   error
         
         //***************************************************************************************
         
         int u=0;
         for(System.out.println("p");u<1;System.out.println("3")) u++;
         
         //***************************************************************************************
         
         //TERNARY OPERATOR   it will compare return type of both if, else statements and return the value casted to the type which is greater
         ArrayList list=new ArrayList();
         list.add(true?10:5.0);            // --> 10.0
         System.out.println(list.get(0));
         
         list.add(true?2:'b');
         System.out.println(list.get(1));    //--> may be it couldn't compare the types so returns nothing
         
         list.add(true?'a':'b');
         System.out.println(list.get(2));   //-->  a
         
         list.add(true?'a':true);
         System.out.println(list.get(3));   //-->  a
         
         list.add(false?"a":10+2);        //-->  12
         System.out.println(list.get(4));  //this solves it first solves and then matches the return types  
        // true?System.out.println("p"):System.out.println("r");   errorj
         
         //*****************************************************************************************
         
         //PRINT HELLO WITHOUT SEMI-COLON
         if(System.out.printf("Hello!\n")==null){}  //print n println return void but printf return printstream
         while(System.out.printf("hello!\n")==null){}
         do{}while(System.out.printf("hello!\n")==null); //this one is using semi-colon but anyways it's cool!
         
         //*********************************************************************************************
         
         //SWITCH
         String s="hi";                         //in java switch can take string values
         switch(s)                              //along with char n all integers
         {                                      //doesn't support boolean, float or double  
             case "hi":
                 System.out.println("hi");
                 break;
             case "hello":
                 System.out.println("hello");
         }
         
         //***************************************************************************************************
         
        //PRINTING THE ASCII VALES ALONG WITH THEIR CODES(DECIMAL)
         for(int f=0;f<128;f++)
         {
             System.out.println(f+" : "+(char)(f));
         }
         
         //*********************************************************************************************
         
         int ch='a';
         System.out.println(ch);
         System.out.println(Integer.toBinaryString(2)); 
         
         //*******************************************************************************************
         
        //MORE ON XOR
         System.out.println("enter two no:");
         int n1=sc.nextInt();
         int n2=sc.nextInt();
         int xor=n1^n2;
         System.out.println("xor= "+n1+"^"+n2+"= "+xor);
         System.out.println(xor+"^"+n1+"= "+(xor^n1));
         System.out.println(xor+"^"+n2+"= "+(xor^n2));         //+ has higher precedence over xor
         */
        
        //**********************************************************************************************
        System.out.println("23".compareTo("3"));
        ArrayList a=new ArrayList();
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(2);
        a.remove(2);
        System.out.println(a);
       
         
    }   
}
class TestBox
{
    static Integer i=new Integer(4);
    int j;
    public static void main(String[] args) {
        TestBox t=new TestBox();
        t.go();
        Integer i1=new Integer(2);
        Integer i2=i1;
        i2=i2+3;
        System.out.println(i1);
        System.out.println(i2);
        
        ArrayList<StringBuffer> s=new ArrayList<StringBuffer>();
        StringBuffer s1=new StringBuffer("payal");
        s.add(s1);
        StringBuffer s2=s.get(0);
        s2.delete(1,3);
        System.out.println(s1);
        System.out.println(s);
        System.out.println(s2);
        
    }
    public void go()
    {
        /*j=i;
        System.out.println(i);
        System.out.println(j);
        System.out.println(new Integer(3));
        System.out.println(new String("payal"));*/
    }
}