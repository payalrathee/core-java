package multithreading;
class MyThread5 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("child2"+i);
            try{Thread.sleep(2000);}
            catch(InterruptedException e){System.out.println("child2 got interrupted");}
        }
    }
}
public class Join extends Thread {
    Thread t;
    void m(Thread t)
    {
        this.t=t;
    }
    public void run()
    {
        try{t.join();}catch(InterruptedException e){}
        for(int i=0;i<5;i++)
        {
            System.out.println("child"+i);
            try{Thread.sleep(2000);}
            catch(InterruptedException e){System.out.println("child got interrupted");}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Join t=new Join();
        MyThread5 t1=new MyThread5();
        t.m(t1);
        t.start();
        t1.start();
        t.join();
        //t1.join();
        for(int i=0;i<5;i++)
        {
            System.out.println("main"+i);
            try{Thread.sleep(2000);}
            catch(InterruptedException e){System.out.println("main got interrupted");}
        }
    }
}
