package multithreading.interThreadCommunication;

class MyThread extends Thread
{
    int total;
    public void run()
    {
        synchronized(this)
        {
            System.out.println("t has acquired lock..");
            for(int i=0;i<20;i++)
            {
                total+=1;
            }
            System.out.println("done..giving notification..");
            this.notify();
        }
    }
}

public class ThreadComm {
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        System.out.println("Total = "+t.total);
        t.start();
        synchronized (t)
        {
            System.out.println("going to print total...");
            System.out.println("main has released lock..waiting for notification...");
            t.wait();
            System.out.println("got notification");
            System.out.println(t.total);
        }
    }
}
