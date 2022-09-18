package multithreading;

class MyThread2 extends Thread
{
    {
        System.out.println(getPriority());
    }
    MyThread2(String name,int p)
    {
        setName(name);
        setPriority(p);
    }
    public void run()
    {
        for(int i=0;i<3;i++)
            System.out.println(this.getName()+" "+getId()+" "+getPriority());
    }
}

class MyThread3 extends Thread
{
    {
        System.out.println(getPriority());
    }
    MyThread3(String name,int p)
    {
        super(name);
        setPriority(p);
    }
    public void run()
    {
        //setName("abcd");
        for(int i=0;i<3;i++)
            System.out.println(getName()+" "+getId()+" "+getPriority());
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        MyThread2 t1=new MyThread2("a",1);
        MyThread2 t2=new MyThread2("b",2);
        MyThread2 t3=new MyThread2("c",3);
        MyThread3 t4=new MyThread3("d",4);
        MyThread3 t5=new MyThread3("e",5);

        Thread.currentThread().setName("payal");
        Thread.currentThread().setPriority(6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        for(int i=0;i<3;i++)
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
    }
}
