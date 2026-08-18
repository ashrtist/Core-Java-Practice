package Vector;
import java.util.*;

public class EnsureCapacity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Vector: ");
        int size=sc.nextInt();

         System.out.println("Enter the Capacity of the Vector: ");
        int capacity=sc.nextInt();

        Vector<Integer> vector=new Vector<>();
        vector.ensureCapacity(capacity);

        System.out.println(vector.capacity());
    }
}
