package Multithreading;
class Alive extends Thread
{
    public void run()
    {
        //System.out.println("this is run method from class Alive ");
    }

}
public class AliveApp {
    public static void main(String[] args) throws InterruptedException{
        Alive a=new Alive();
        System.out.println("Thread alive before start: "+a.isAlive());
        a.start();
        System.out.println("Thread alive After start: "+a.isAlive());
        a.join(); //this will 
        System.out.println("Thread alive After Execution: "+a.isAlive());
    }
}
