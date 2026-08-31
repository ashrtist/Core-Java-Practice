package Multithreading;

class A extends Thread
{
    public void run()
    {

    }
}
class B extends Thread
{
    public void run()
    {

    }
 
}
class C extends Thread
{
    public void run()
    {

    }
  
}
public class PriorityApp {
    public static void main(String[] args) {
        A a=new A();
        a.setPriority(3);
        B b=new B();
        b.setPriority(6);
        C c=new C();
        c.setPriority(9);
        System.out.println("Thread 1 priority: "+a.getPriority());
        System.out.println("Thread 2 priority: "+b.getPriority());
        System.out.println("Thread 3 priority: "+c.getPriority());
    

    
    }
}
