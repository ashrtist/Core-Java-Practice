package ArrayList;

public class SumOfAllSubset {
    public static void main(String[] args) {
        int nums[] = new int[]{5,1,6};
       int numSum=0;
       int xsum=0;
       int subSum=0;
       //sum of the number;
       for(int i=0;i<nums.length;i++)
       {
        numSum=numSum+nums[i];
        xsum=xsum^nums[i];
       }
       System.out.println(numSum);
       System.out.println(xsum);
       }
    }
