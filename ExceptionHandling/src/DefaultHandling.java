public class DefaultHandling {
    public static void main(String[] args) {
        m1();
        //System.out.println(1/0);
    }
    public static void m1()
    {
        m2();
    }
    public static void m2()
    {
        System.out.println(1/0);
    }
}
