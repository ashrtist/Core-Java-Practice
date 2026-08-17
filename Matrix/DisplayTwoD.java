package Matrix;
import java.util.*;
public class DisplayTwoD {
    public static void main(String[] args) {
        System.out.println("2D Matrix: ");
        int a[][]= new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements in the Matrix: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nDispplay Matrix: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
