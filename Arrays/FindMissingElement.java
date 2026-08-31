package Arrays;
import java.util.*;

public class FindMissingElement
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        
        int a[]=new int[size];

        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Display Array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }

        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }

        System.out.println("Missing Elements are: ");
        for(int i=min;i<=max;i++)
        {
            boolean found=false;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==i)
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                System.out.print(i+" ");
            }
        }
    }
}