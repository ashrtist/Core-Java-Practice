package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the size: ");
        int size =sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        {
            al.add(sc.nextInt());
        }

        System.out.println("Enter value to Search For: ");
        int value=sc.nextInt();

        if(al.contains(value))
        {
            System.out.println(value+" present in ArrayList at "+al.indexOf(value));
        }
        else
        {
            System.out.print(value+" Not Exist");
        }
        sc.close();
    }
}
