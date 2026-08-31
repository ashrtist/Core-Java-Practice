package Multithreading;

import java.lang.Thread;
public class Sleep1 extends Thread{
    public static void main(String[] args) {
        try
        {
        System.out.println("A");
        Thread.sleep(5000);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is"+ex);
        }

System.out.println("B");
    }
}
