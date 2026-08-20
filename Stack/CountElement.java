package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CountElement {
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

        int count=0;
        while(!stack.empty())
        {
            stack.pop();
            count++;
        }

        System.out.println("Count: "+count);
    }
}
