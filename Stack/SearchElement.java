package Stack;
import java.util.Stack;
import java.util.Scanner;

public class SearchElement
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

        System.out.println("Enter Element to Search ");
        int element=sc.nextInt();
        int search=stack.search(element);
        if(search!= -1)
        {
            System.out.println("Element Found At: "+search);
        }
        else
        {
            System.out.println("Element Doest Not Exist!!");
        }
    }
}
