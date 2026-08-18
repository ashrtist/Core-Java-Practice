package LinkedList;
import java.util.*;
public class AddAndDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Linked List: ");
        int size=sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter the Elements: ");
        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }

        System.out.println("Dispaly Linked List: "+list);
    }
}
