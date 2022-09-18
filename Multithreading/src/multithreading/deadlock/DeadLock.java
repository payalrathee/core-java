package multithreading.deadlock;

class A
{
    public synchronized void f(B b)
    {
        System.out.println("thread a has acquired a's lock");
        try{Thread.sleep(2000);}catch(InterruptedException e){}
        System.out.println("trying to acquire b's lock");
        synchronized (b)
        {
            System.out.println("thread a has acquired b's lock");
        }

    }
}

class B
{
    public synchronized void f(A a)
    {
        System.out.println("thread b has acquired b's lock");
        try{Thread.sleep(2000);}catch(InterruptedException e){}
        System.out.println("trying to acquire a's lock");
        synchronized (a)
        {
            System.out.println("thread b has acquired a's lock");
        }
    }
}

public class DeadLock extends Thread{
    A a=new A();
    B b=new B();

    public void run()
    {
        a.f(b);
    }
    public void m()
    {
        b.f(a);
    }
    public static void main(String[] args) {
        DeadLock d=new DeadLock();
        d.start();
        d.m();
    }
}
