package Multithreading;

import java.util.Scanner;

class FirstHalf extends Thread
{
    FirstHalf(int a[])
    {
        this.a=a;
    }
    int a[];
    int sum;

    public void setSum(int sum)
    {
        this.sum=sum;
    }

    public int getSum()
    {
        return sum;
    }

    public void run()
    {
        for(int i=0;i<a.length/2;i++)
        {
            sum=sum+a[i];
        }
        System.out.print("\nThread1 sum: "+sum);
    }
}

class SecondtHalf extends Thread
{
    int a[];
    int sum;

    SecondtHalf(int a[])
    {
        this.a=a;
    }
     public void setSum(int sum)
    {
        this.sum=sum;
    }

    public int getSum()
    {
        return sum;
    }

    public void run()
    {
        for(int i=a.length/2;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.print("\nThread2 sum: "+sum);
    }
}


public class ArrayDelayApp {
    public static void main(String args[]) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();

        int a[]=new int[size];

        System.out.println("Enter the values in Array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }


        FirstHalf f=new FirstHalf(a);
        SecondtHalf s=new SecondtHalf(a);
        
        f.start();
        s.start();
        f.join();
        s.join();

        // Main thread calculates final sum
        int total = f.getSum() + s.getSum();

        System.out.println("\nTotal sum: " + total);
    }
}
