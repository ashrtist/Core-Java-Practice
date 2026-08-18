package ArrayList;
import java.util.*;
public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Size of the Arraylist: ");
        int size=sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            al.add(sc.nextInt());
        }

        System.out.println("\nDisplay ArrayList Before Reverse: "+al);

        int first=0;
        int last=al.size()-1;
        while (first<last) 
        {
           int temp=al.get(first); //
           al.set(first,al.get(last));
           al.set(last,temp);
           first++;
           last--;
        }

        System.out.println("\nDisplay ArrayList After Reverse: "+al);
    }
}
