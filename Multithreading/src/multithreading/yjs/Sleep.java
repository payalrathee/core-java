package multithreading;
class ABC
{
    int data;
    void display()
    {
        System.out.println("will display data in few seconds...");
        try
        {
            Thread.sleep(10000,100);
        }
        catch(InterruptedException e)
        {
            System.out.println("display got interrupted");
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("data : "+(++data));
            try{Thread.sleep(2000);}
            catch(InterruptedException e){
                System.out.println("data got interrupted");}
        }
    }
}
class MyThread4 extends Thread
{
    MyThread4(String name)
    {
        setName(name);
    }
    public void run()
    {
        System.out.println("enter a");
        for(int i=0;i<3;i++)
            System.out.print("Hello ");
        System.out.println("a is going to sleep");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("a got interrupted");
        }
        System.out.println("a is awake");

        ABC obj=new ABC();
        obj.display();

        System.out.println("end a");

    }
}
public class Sleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("enter main");
        MyThread4 t= new MyThread4("a");
        t.start();
        t.interrupt();
        System.out.println("main is going to sleep");
        Thread.sleep(5000);
        System.out.println("main is awake");
        t.interrupt();
        System.out.println("end main");
    }
}
