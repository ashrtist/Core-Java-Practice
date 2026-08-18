package Vector;

import java.util.*;

public class AddAtSpecificIndex 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        System.out.print("ArrayList Before Added Element");
        System.out.print(vector+" ");
        System.out.println("\nEnter value :");
        int value=sc.nextInt();

        System.out.println("\nEnter the index ");
        int index=sc.nextInt();

        vector.add(index, value);

        System.out.print("ArrayList After Added Element");
        System.out.print(vector+" ");
        sc.close();
    }
}
