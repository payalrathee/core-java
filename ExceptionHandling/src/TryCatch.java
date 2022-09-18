public class TryCatch {
    public static void main(String[] args) {
        System.out.println("main starts...");
        try
        {
            String s="abc";
            System.out.println(s.length());
           System.out.println(1/2);
            int[] a={1,2,3};
            System.out.println(a[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        finally
        {
            System.out.println("in finally...");
        }

        System.out.println("main ends...");

    }
}
