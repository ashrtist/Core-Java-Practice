package LinkedList;
import java.util.*;
public class SearchElement {
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

        System.out.println("Enter the Element to search in the linkedlist: ");
        int value =sc.nextInt();

        if(list.contains(value))
        {
            System.out.println("Element Found at: "+list.indexOf(value));
        }
        else{
            System.out.println("Element Doest not Exist...");
        }
    }
}
