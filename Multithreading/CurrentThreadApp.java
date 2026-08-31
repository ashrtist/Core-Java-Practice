package Multithreading;
class CurrentThread extends Thread{
    public void run()
    {
        System.out.println("Current thread is: "+Thread.currentThread().getName());

    }
}
public class CurrentThreadApp {
    public static void main(String args[])
    {
        CurrentThread ct = new CurrentThread();
        ct.start();
        ct.run();
        System.out.println("Current thread is: "+Thread.currentThread().getName());
    }
}
