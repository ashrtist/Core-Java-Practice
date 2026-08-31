package Multithreading;

class First extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("First is "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
    }
}

class Second extends Thread
{
    public void run()
    {
        try
        {
            for(int j=1;j<=5;j++)
            {
                System.out.println("Second is "+j);
                Thread.sleep(2000);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
    }
}
public class CreateThread {
    public static void main(String[] args) {
        First f =new First();
        f.start();
        Second s = new Second();
        s.start();
    }
}
