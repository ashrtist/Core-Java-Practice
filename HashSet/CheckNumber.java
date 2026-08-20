package HashSet;
import java.util.HashSet;
import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the size if the HashSet: ");
        int size=sc.nextInt();

        var hs=new HashSet<>();

        System.out.println("Enter the elements in the HashSet: ");
        for(int i=0;i<size;i++)
        {
            hs.add(sc.nextInt());
        }

        System.out.println("HashSet: "+hs);

        //Displaying the Number Between 1 to 10

        System.out.println("Number Between 1-10 are: ");
        for(int i=1;i<=10;i++)
        {
            if(hs.contains(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
