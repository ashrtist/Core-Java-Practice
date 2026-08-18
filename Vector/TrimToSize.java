package Vector;
import java.util.*;

public class TrimToSize {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Vector: ");
        int size=sc.nextInt();

         System.out.println("Enter the Capacity of the Vector: ");
        int capacity=sc.nextInt();

        Vector<Integer> vector=new Vector<>();
        vector.ensureCapacity(capacity);

        System.out.println("Capacity before Trim: "+vector.capacity());
        
        System.out.println("Capacity After Trim and Without Adding Elements: "+vector.capacity());

        
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            vector.add(sc.nextInt());
        }

        vector.trimToSize();
        System.out.println("Capacity After Trim and After Adding Elements: "+vector.capacity());
    }
}
