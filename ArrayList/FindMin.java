package ArrayList;
import java.util.Stack;
import java.lang.classfile.constantpool.IntegerEntry;
import java.util.Scanner;
public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int size=sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++)
        {
            stack.push(sc.nextInt());
        }

        int min=stack.elementAt(0);
        for(int i=0;i<size;i++)
        {
            if(stack.elementAt(i)<min)
            {
                min=stack.elementAt(i);
            }
        }
        System.out.println("Minimum Element: "+min);
    }
}
