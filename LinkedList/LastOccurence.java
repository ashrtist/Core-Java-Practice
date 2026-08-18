package LinkedList;
import java.util.*;
public class LastOccurence {
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
        System.out.println("Enter the Element to Find Last Occurence : ");
        Integer value =sc.nextInt();

        System.out.println(value+" Last Occurence is At : "+list.lastIndexOf(value));
    }
}
