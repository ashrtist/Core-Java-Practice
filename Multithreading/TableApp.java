package Multithreading;
import java.util.Scanner;


class Table extends Thread
{
    int number;
    public void run()
    {
        printtable();
    }
    public void setNumber(int number)
    {
        this.number=number;
    }

    public int getnumber()
    {
        return number;
    }

    public void printtable()
    {
        for(int i=1;i<=10;i++)
            {
                System.out.println(number+" * "+i+" = "+number*i);
            }    
    }
}
public class TableApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        Table t = new Table();
        
        t.setNumber(num);
        t.start();
        
    }
}
