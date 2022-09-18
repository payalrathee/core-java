package multithreading;

class Display
{
    public static void display(String name)
    {
        for(int i=0;i<5;i++)
        {
            try{Thread.sleep(2000);}catch(InterruptedException e){}
            System.out.println(name);
            Thread.yield();
        }
    }
}

class MyThread6 extends Thread
{
    public void run()
    {
        System.out.println("In thread"+getName());
        Display.display("payal");
        System.out.println("end of"+getName());
    }
}

class MyThread7 extends Thread
{
    String s;
    MyThread7(String name)
    {
        this.s=name;
    }
    public void run()
    {
        System.out.println(s);
    }
}

public class Yield {
    public static void main(String[] args) {
        MyThread6 t=new MyThread6();
        MyThread7 t1=new MyThread7("a");
        MyThread7 t2=new MyThread7("b");
        MyThread7 t3=new MyThread7("c");
        MyThread7 t4=new MyThread7("d");

        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("end main");
    }
}
