package ArrayList;
import java.util.*;
public class TraverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Arraylist: ");
        int size=sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the Elements: ");
        for(int i=0;i<size;i++)
        {
            al.add(sc.nextInt());
        }

        //Display List
        System.out.println("Display List : ");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
