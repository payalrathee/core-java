package multithreading;
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("child"+i);
    }
}

public class DefineThread1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.run();
        t.start();
        for(int i=0;i<5;i++)
            System.out.println("Main"+i);
        //t.start();
    }
}
