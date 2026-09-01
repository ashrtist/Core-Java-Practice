package Multithreading;
class Thread1 extends  Thread
{
    public void run()
    {
        System.out.println("Thread 1 is Running: ");
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread1 is: "+i);
        }
        System.out.println("Thread 1 is Completed: ");
    }
}

class Thread2 extends Thread
{
    Thread1 t1;
    Thread2(Thread1 t1)
    {
        this.t1=t1;
    }

    public void run()
    {
        try{
            t1.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
        }
        System.out.println("Thread 2 started after Thread 1: ");
    } 
}
public class JoinApp {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2(t1);
        t1.start();
        t2.start();
    }
}
