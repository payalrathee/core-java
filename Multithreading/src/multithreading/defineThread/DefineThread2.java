package multithreading;
class MyRunnable implements Runnable
{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("child"+i);
    }
}
public class DefineThread2 {
    public static void main(String[] args) {
        Thread t1=new Thread();
        t1.run();
        t1.start();
        MyRunnable r=new MyRunnable();
        Thread t2=new Thread(r);
        t2.run();
        t2.start();
    }
}
