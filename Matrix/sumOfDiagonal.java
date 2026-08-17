package Matrix;
import java.util.Scanner;

public class sumOfDiagonal {
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

        int lsum=0;
        int rsum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                {
                    lsum=lsum+a[i][j];
                }
                if(j==2-i)
                {
                    rsum=rsum+a[i][j];
                }
            }
        }

        System.out.println("\nSum of Left Diagonal is:  :"+lsum);
        System.out.println("\nSum of Right Diagonal is:  :"+rsum);
    }    
}
