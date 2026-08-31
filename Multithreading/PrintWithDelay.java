package Multithreading;

class Sleep extends Thread
{
    public void run()
    {
        try {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                sleep(1000);
            }
            
        } catch (Exception ex) {
           System.out.println("Exception is "+ex);
        }
    }
}

public class PrintWithDelay {
    public static void main(String[] args) {
        Sleep s = new Sleep();
        s.start();
    }
}
