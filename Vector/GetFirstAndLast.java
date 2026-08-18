package Vector;
import java.util.*;

public class GetFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Vector: ");
        int size=sc.nextInt();

        Vector <Integer> vector = new Vector<>();

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            vector.add(sc.nextInt());
        }
        
        System.out.println("First ELement : "+vector.firstElement());
        System.out.println("Last ELement : "+vector.lastElement());
    }
}
