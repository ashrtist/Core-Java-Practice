package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateElement {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.print("ArrayList Before Update: ");
        System.out.print(al+" ");
        System.out.println("\nEnter Value to be Updated:");
        int value=sc.nextInt();

        System.out.println("Enter the index to be Updated");
        int index=sc.nextInt();

        al.set(index, value);
        System.out.print("ArrayList After Update: ");
        System.out.println(al);
        sc.close();
    }
}
