package Stack;
import java.util.*;
public class ChechEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Element: ");
        int size=sc.nextInt();

        Stack<Integer> stack=new Stack<>();

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack before Removal: "+stack);
        while(!stack.empty())
        {
            System.out.println("Popped-->"+stack.pop());
        }
        System.out.println("Stack After Removal: "+stack);
        if(stack.empty())
        {
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack is Not Empty: \n"+stack);
        }
        sc.close();
    }
}
