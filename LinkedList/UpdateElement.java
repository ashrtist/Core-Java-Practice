package LinkedList;
import java.util.*;
public class UpdateElement {
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

        System.out.println("List Before Updation: "+list);

        System.out.println("Enter the Element to Updatet: ");
        Integer value =sc.nextInt();

        System.out.println("Enter the Index to Updatet: ");
        Integer index =sc.nextInt();

        list.set(index,value);
        System.out.println("Updated List: "+list);
    }
}
