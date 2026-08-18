package ArrayList;

import java.util.*;

public class AddAtSpecificIndex 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.print("ArrayList Before Added Element");
        System.out.print(al+" ");
        System.out.println("\nEnter value :");
        int value=sc.nextInt();

        System.out.println("\nEnter the index ");
        int index=sc.nextInt();

        al.add(index, value);

        System.out.print("ArrayList After Added Element");
        System.out.print(al+" ");
    }
}
