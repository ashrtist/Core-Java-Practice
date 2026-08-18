package ArrayList;
import java.util.*;
public class TraverseUsingEnhancedLoop {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Arraylist: ");
        int size=sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("ENter the elements: ");
        for(int i=0;i<size;i++)
        {
            al.add(sc.nextInt());
        }

        System.out.println("DispalyList : ");
        for(Integer value:al)
        {
            System.out.println(value);
        }
    }
}
