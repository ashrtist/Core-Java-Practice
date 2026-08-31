package Multithreading;

import java.util.Scanner;

class Numbers extends Thread
{
    int num;
    public void setNumber(int num)
    {
        this.num=num;
    }

    public void run()
    {
        try{
            System.out.println("Thread Started: ");
            for(int i=1;i<=num;i++)
            {
                System.out.print(i+" ");
            }
            System.out.println("\nThread Finished");
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
        }
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int limit=sc.nextInt();
        Numbers n = new Numbers();
        n.setNumber(limit);
        n.start();
    }
}
