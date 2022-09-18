package multithreading.daemon;

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try{Thread.sleep(2000);}catch (InterruptedException e){}
//            System.out.println("suspending...");
//            suspend();
//            try{Thread.sleep(1000);}catch (InterruptedException e){}
//            System.out.println("resuming...");
//            resume();
        }
    }
}

public class Daemon {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        MyThread t=new MyThread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
        t.start();
        //t.stop();
        try{Thread.sleep(5000);}catch (InterruptedException e){}
    }
}
