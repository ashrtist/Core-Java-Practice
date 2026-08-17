package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class sortByColumn {
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

        System.out.println("\nDisplay Matrix before Sorting : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<a.length;i++)
        {
            int dummy[]=new int[3];
            for(int j=0;j<a[i].length;j++)
            {
                dummy[j]=a[j][i];
            }
            Arrays.sort(dummy);
            for(int m=0;m<a.length;m++)
            {
                a[m][i]=dummy[m];
            }
        }

         System.out.println("\nDisplay Matrix After Sorting : ");
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
