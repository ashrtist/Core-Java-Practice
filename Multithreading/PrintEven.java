package Multithreading;
import java.util.Scanner;
class EvenNumber implements Runnable
{
    int num;
    public void setNum(int num)
    {
        this.num=num;
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=num;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i+" ");
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
        }
    }
}

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int limit=sc.nextInt();
        
        EvenNumber en = new EvenNumber();
        Thread t= new Thread(en);
        en.setNum(limit);
        t.start();
    }
}
