package multithreading;

class MyThread1 extends Thread
{
    public void start()
    {
        super.start();
        System.out.println("hi bye");
    }
    public void run()
    {
        System.out.println("running child thread");
    }
}

public class DefineThread4 {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        t.start();
        t.run();
    }
}
