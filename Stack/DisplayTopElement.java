package Stack;
import java.util.Stack;
import java.util.Scanner;

public class DisplayTopElement
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack: ");
        int size=sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack Before Peek: "+stack);

        System.out.println("Top Element: "+stack.peek());
        System.out.println("Stack After Peek: "+stack);
    }
}