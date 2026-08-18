package ArrayList;
import java.util.*;
public class AccessElement {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("ArrayList: "+al);
        System.out.println("Enter the index to see value: ");
        int value=sc.nextInt();
        if(value >= 0 && value < al.size())
        {
            System.out.println("Value at Given Index is: "+al.get(value));
        }
        else
        {
            System.out.println("Enter Valid Index");
        }   
    }
}
