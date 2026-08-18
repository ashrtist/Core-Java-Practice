package Vector;
import java.util.*;

public class RemoveElement {
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
        System.out.println("Vector Before Removal of Element: "+vector);
        
        vector.removeElementAt(0);
        vector.removeElementAt(vector.size()-1);

        System.out.println("Vector After Removal of Element: "+vector);
    }
}
