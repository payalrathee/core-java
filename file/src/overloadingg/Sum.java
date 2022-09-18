package overloadingg;

public class Sum {
    public static void sum(long a,long b)
    {
        long sum=a+b;
        System.out.println("Sum is: "+sum);
    }
    public static void sum(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("Sum is: "+sum);
    }
    public static void sum(float a,float b)
    {
        float sum=a+b;
        System.out.println("Sum is: "+sum);
    }
    public static void display(String s,int a)
    {
        System.out.println(s+" "+a);
    }
    public static void display(int a,String s)
    {
        System.out.println(a+" "+s);
    }

    public static void main(String[] args) {
        sum(1l,2l);
        sum(2.3f,1.2f);
        display("a",1);
        display(1,"a");
        sum(1,2);           //type promotion

    }
}
