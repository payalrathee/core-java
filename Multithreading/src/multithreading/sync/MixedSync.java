package multithreading.sync;

class A
{
    int n;
    static int n1;
    public synchronized void updateN(int x)
    {
        System.out.println(Thread.currentThread().getName()+" is updating n");
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" has updated n to "+(n+=x));
            try{Thread.sleep(2000);}
            catch(InterruptedException e){}
        }
        System.out.println(Thread.currentThread().getName()+" has updated n");
    }
    public void readN()
    {
        System.out.println(n);
    }

    public synchronized static void updateN1(int x)
    {
        System.out.println(Thread.currentThread().getName()+" is updating n1");
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" has updated n1 to "+(n1+=x));
            try{Thread.sleep(2000);}
            catch(InterruptedException e){}
        }
        System.out.println(Thread.currentThread().getName()+" has updated n1");
    }

    public static void readN1()
    {
        System.out.println(n1);
    }
}

class MyThread10 extends Thread{
    A a;
    int n;
    MyThread10(A a,int n)
    {
        this.a=a;
        this.n=n;
    }
    public void run()
    {
        a.updateN(n);
    }
}
class MyThread11 extends Thread{
    A a;
    MyThread11(A a)
    {
        this.a=a;
    }
    public void run()
    {
        a.readN();
    }
}
class MyThread12 extends Thread{
    int n1;
    MyThread12(int n1)
    {
        this.n1=n1;
    }
    public void run()
    {
        A.updateN1(n1);
    }
}
class MyThread13 extends Thread{

    public void run()
    {
        A.readN1();
    }
}



public class MixedSync {
    public static void main(String[] args) throws InterruptedException {
        A a=new A();
        MyThread10 t=new MyThread10(a,1);
        MyThread10 t1=new MyThread10(a,2);
        MyThread11 t2=new MyThread11(a);
        MyThread12 t3=new MyThread12(3);
        MyThread12 t4=new MyThread12(4);
        MyThread13 t5=new MyThread13();

        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();


        System.out.println(" updated n is :"+a.n);
        System.out.println(" updated n1 is : "+A.n1);
    }
}
