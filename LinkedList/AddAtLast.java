package LinkedList;
import java.util.*;

public class AddAtLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the LinkedList: ");
        int size=sc.nextInt();

        LinkedList <Integer> list = new LinkedList<>();

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }

        System.out.println("Enter Value to add at Last: ");
        int value=sc.nextInt();

        list.addLast(value);
        System.out.println("Linked List Affter Adding At Beginning: "+list);
    }
}
