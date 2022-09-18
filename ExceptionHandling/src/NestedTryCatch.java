public class NestedTryCatch {

    public static void main(String[] args) {
        String s=null;
        int[] a={1,2,3};
        System.out.println("main starts...");
        try
        {
            System.out.println(1/2);
            System.out.println("in outer try");
            try
            {
                System.out.println(s.length());
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("in outer try");
        }
        catch(ArithmeticException e)
        {
            System.out.println( e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            try
            {
                System.out.println(a[5]);
            }
            catch(NullPointerException ex)
            {
                System.out.println(ex);
            }
        }

        System.out.println("main ends...");
    }
}
