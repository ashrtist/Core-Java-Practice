package SlidingWindow;

public class MaxSum {
    public static void main (String x[])
    {

        //declare the variables
        int a[]= new int[]{2, 1, 5, 1, 3, 2};
        int k=3;
        int sum=0;
        int maxSum=0;
        //iterate from 0 to k
        for(int i=0;i<k;i++)
        {
            sum=sum+a[i];
        }
        //set maxsum=sum of first window

        maxSum=sum;
        //then we will go from k to the last index and manipualate the sum
        for(int i=k;i<a.length;i++)
        {
            sum=sum+a[i]-a[i-k]; //a[i]=next value from wrt last window added and 
                                // a[i-k]-->a[3-3]-->a[0]=first value is deleted ie the next window
            if(sum>maxSum)
        {
            maxSum=sum;
        }
        }
        System.out.println("max sum: "+maxSum);
    }
}
