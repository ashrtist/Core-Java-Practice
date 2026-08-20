package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int size=sc.nextInt();

        Stack<Integer> stack1 = new Stack<>();

        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++)
        {
            stack1.push(sc.nextInt());
        }

        System.out.println("Orignal stack: "+stack1);

        Stack<Integer> stack2 = new Stack<>();

        Stack<Integer> intermediate = new Stack<>();
       
        for(int i=0;i<size;i++)
        {
            int value=stack1.pop();
            stack2.push(value);
            intermediate.push(value);
        }
    
        for(int i=intermediate.size()-1;i>=0;i--)
        {
            stack1.push(intermediate.elementAt(i));
        }

        System.out.println("Orignal stack: "+stack1);
        System.out.println("Reversed stack: "+stack2);
    }
}
