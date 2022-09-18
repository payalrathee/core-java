package multithreading.sync;

class B
{
    int n;
    public void updateN(int x)
    {
        System.out.println(Thread.currentThread().getName()+" is out of sync block");
        try{Thread.sleep(10);}catch (InterruptedException e){}
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName()+"is in sync block");
            for(int i=0;i<5;i++)
            {
                System.out.println(n=+x);
                try{Thread.sleep(1000);}
                catch (InterruptedException e){}
            }
        }
        System.out.println(Thread.currentThread().getName()+" is out of sync block");
    }
}

class MyThread99 extends Thread
{
    B b=new B();
    int n;
    MyThread99(B b,int n)
    {
        this.b=b;
        this.n=n;
    }
    public void run()
    {
        b.updateN(n);
    }
}

public class SyncBlock {
    public static void main(String[] args) {
        B b=new B();
        MyThread99 t1=new MyThread99(b,1);
        MyThread99 t2=new MyThread99(b,2);
        t1.start();
        t2.start();
    }
}
