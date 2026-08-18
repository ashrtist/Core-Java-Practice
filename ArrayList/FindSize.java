package ArrayList;
import java.util.*;
public class FindSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList: ");
        int size=sc.nextInt();

        ArrayList<Integer> al =new ArrayList<>();

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            al.add(sc.nextInt());
        }

        System.out.println("Arraylist: "+al);
        System.out.println(al.size());
    }
}
