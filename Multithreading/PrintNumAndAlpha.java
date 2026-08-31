package Multithreading;

class Number extends Thread
{
    public void run()
    {
        try{
            System.out.print("Number Thread: ");
            for(int i=1;i<=5;i++)
            {
                System.out.print(i+" ");
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
        }
    }
} 

class Alphabets extends Thread
{
    public void run()
    {
        try{
            System.out.print("\nAlphabet Thread: ");
            for(int i=1;i<=5;i++)
            {
                //int convert=i+64;
                System.out.print(((char)(i+64))+" ");
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
        }
    }
} 

public class PrintNumAndAlpha {
    public static void main(String[] args) throws InterruptedException {
        Number n=new Number();
        n.start();
        n.join();   //wait until the n will finish

        Alphabets a = new Alphabets();
        a.start();
    }
}
