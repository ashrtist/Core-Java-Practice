package Vector;
import java.util.*;
public class RemoveElementByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Vector: ");
        int size=sc.nextInt();

        Vector<Integer> vector=new Vector<>();

        for(int i=0;i<size;i++)
        {
            vector.add(sc.nextInt());
        }

        System.out.println("Enter Element to Remove: ");
        int remove = sc.nextInt();

        System.out.println("Vector Before Removal: "+vector);

        vector.removeElement(remove);
        System.out.println("Vector After Removal: "+vector);
    }
}
