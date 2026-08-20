package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
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
        for(Integer value: stack1)
        {
            stack2.push(value);
        }

        System.out.println("Copy stack: "+stack2);
    }
}
