package Matrix;
import java.util.*;
public class SumofRow {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        int a[][]=new int[3][3];
        System.out.println("Enter the elements: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<a[i].length ;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<a[i].length ;j++)
            {
                sum=sum+a[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println("sum= "+sum);
        }
    }    
}
