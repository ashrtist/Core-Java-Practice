package LinkedList;
import java.util.*;
public class RemoveValue {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Linked list: ");
        int size=sc.nextInt();
        
        LinkedList <Integer> list = new LinkedList<>();

        System.out.println("Enter the elenets of the Linked List: ");
        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }

        System.out.println("List Before Deletion: "+list);

        System.out.println("Enter the Element to Delete: ");
        Integer value =sc.nextInt();

        list.remove(value);
        System.out.println("Updated List: "+list);
    }
}
