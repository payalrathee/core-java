public class Basics {
    public static void main(String[] args) {

        /* DATATYPES */

        //PRIMITIVE DATATYPES

        //Numeric datatypes
        //Integer datatypes
        byte b=10;
        short s=10;
        int i=20;
        long l=30l;

        //floating point
        float f=10.2f;
        double d=20.54d;

        //non numeric datatypes
        char c='a';
        boolean bool=true;

        //REFERENCE DATATYPES
        String str="hello";
        StringBuffer sb=new StringBuffer("world");

        /* OPERATORS  */

        //increment/decrement
        int a=10;
        System.out.println(a++);    //post increment
        System.out.println(++a);    //pre increment
        System.out.println(a--);    //post decrement
        System.out.println(--a);    //pre decrement

        //arithmetic
        int x=6;
        int y=4;
        System.out.println(a+b);    //addition
        System.out.println(a-b);    //subtraction
        System.out.println(a*b);    //multiplication
        System.out.println(a/b);    //division
        System.out.println(a%b);    //modulus

        //String concatenation
        System.out.println("Hello"+"World");

        //Relational
        int p=20;
        int q=30;
        System.out.println(a>b);    //greater than
        System.out.println(a<b);    //less than
        System.out.println(a<=b);    //less than equal to
        System.out.println(a>=b);    //greater than equal to
        System.out.println(a==b);    //equal to
        System.out.println(a!=b);    //not equal to

        //logical
        System.out.println(a>b&&x==y);    //AND
        System.out.println(a<b||x>y);    //OR
        System.out.println(!(x==y));    //NOT

        //bitwise
        System.out.println(4&5);    //bitwise AND
        System.out.println(4|5);    //bitwise OR
        System.out.println(4^5);    //bitwise XOR
        System.out.println(~4);    //bitwise complement

        //shift
        System.out.println(10>>2);    //right shift
        System.out.println(10>>2);    //left shift
        System.out.println(10>>>2);    //unsigned right shift

        //assignment
        int u=10;
        int v=20;
        u=v;

        //shorthand assignment
        u+=v;
        u-=v;
        u*=v;
        u/=v;
        u%=v;
        System.out.println(u);
        System.out.println(v);

        //conditional/ ternary
        System.out.println(10>2?3:4);
        System.out.println(10<2?3:4);

        //instance of
        System.out.println("abc" instanceof String);
        System.out.println("abc" instanceof Object);



    }
}
