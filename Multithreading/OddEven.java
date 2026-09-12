package Multithreading;

import java.util.Scanner;


class Odd extends Thread
{
    int n;
    public void setOdd(int n)
    {
        this.n=n;
    }
    public int getOdd()
    {
        return n;
    }

    public void run()
    {
        displayOdd();
        
    }

    public void displayOdd()
    {
        System.out.print("Odd Thread: ");
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    
    }
}

class Even extends Thread
{
    int n;
    public void setEven(int n)
    {
        this.n=n;
    }
    public int getEven()
    {
        return n;
    }

    public void run()
    {
        displayEven();
    }

    public void displayEven()
    {
        System.out.print("\nEven Thread: ");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}

public class OddEven {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:" );
        int limit=sc.nextInt();

        Odd d=new Odd();
        d.setOdd(limit);
        d.start();
        d.join();
        Even e= new Even();
        e.setEven(limit);
        e.start();
    }
}
