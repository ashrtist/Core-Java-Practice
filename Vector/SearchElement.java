package Vector;
import java.util.*;
import java.util.Vector;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Vector: ");
        int size=sc.nextInt();

        Vector<Integer> vector=new Vector<>();

        for(int i=0;i<size;i++)
        {
            vector.add(sc.nextInt());
        }

        System.out.println("Enter Element to Search: ");
        int search = sc.nextInt();

        if(vector.contains(search))
        {
            System.out.println("Element Present at "+vector.indexOf(search));
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
