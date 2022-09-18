package multithreading.sync;

class Display2
{
    static int n;
    public static synchronized void updateN(int x)
    {
        System.out.println(Thread.currentThread().getName()+" is updating n:");
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" has updated n to : "+(n+=x));
            try{Thread.sleep(2000);}
            catch(InterruptedException e){}
        }
        System.out.println("n is updated by "+Thread.currentThread().getName());
    }
}

class MyThread9 extends Thread
{
    int n;
    MyThread9(int n)
    {
        this.n=n;
    }
    public void run()
    {
        Display2.updateN(n);
    }
}

public class StaticSync {
    public static void main(String[] args) throws InterruptedException{
        MyThread9 t1=new MyThread9(1);
        MyThread9 t2=new MyThread9(2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("updated n is : "+Display2.n);
    }
}

