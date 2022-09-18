package multithreading.sync;

class Display1
{
    int n;
    public /*synchronized*/ void updateN(int x)
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

class MyThread8 extends Thread
{
    Display1 d;
    int n;
    MyThread8(Display1 d,int n)
    {
        this.d=d;
        this.n=n;
    }
    public void run()
    {
        d.updateN(n);
    }
}

public class Sync {
    public static void main(String[] args) throws InterruptedException{
        Display1 d=new Display1();
        //Display1 d1=new Display1();
        MyThread8 t1=new MyThread8(d,1);
        MyThread8 t2=new MyThread8(d,2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("updated n is : "+d.n);
        //System.out.println("updated n by t2 is : "+d1.n);
    }
}
