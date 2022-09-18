package multithreading;
public class DefineThread3 extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
            System.out.print("child ");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start main");
        DefineThread3 t=new DefineThread3();
        t.start();
        Thread.sleep(2000);
        System.out.println("\nend of main");
    }
}
