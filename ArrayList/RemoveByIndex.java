package ArrayList;
import java.util.*;
public class RemoveByIndex {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the elements: ");
        for(int i=0;i<5;i++)
        {
            al.add(sc.nextInt());
        }
        System.out.println("ArrayList Before Removal: "+al);
        System.out.println("Enter the index to remove the element: ");
        int index = sc.nextInt();

        al.remove(index);
        System.out.println("ArrayList After Removal: "+al);
    }
}
