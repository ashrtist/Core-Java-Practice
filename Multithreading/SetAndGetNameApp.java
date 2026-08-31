package Multithreading;
import java.util.Scanner;

class SetAndGetName extends Thread
{
    public void run()
    {
        //overridenb method
    }

}

public class SetAndGetNameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Thread: ");
        String name= sc.nextLine();
        SetAndGetName ref = new SetAndGetName();
        ref.setName(name);

        System.out.println("Thread name is: "+ref.getName());
    }
}
