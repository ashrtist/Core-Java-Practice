package Stack;
import java.util.Stack;
import java.util.Scanner;

public class PushElement
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack: ");
        int size=sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("ENter the elements: ");
        for(int i=0;i<size;i++)
        {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack: "+stack);
    }
}