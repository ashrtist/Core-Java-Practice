/*3683. Earliest Time to Finish One Task

You are given a 2D integer array tasks where tasks[i] = [si, ti].

Each [si, ti] in tasks represents a task with start time si that takes ti units of time to finish.

Return the earliest time at which at least one task is finished.

Example 1:

Input: tasks = [[1,6],[2,3]]

Output: 5

Explanation:

The first task starts at time t = 1 and finishes at time 1 + 6 = 7. 
The second task finishes at time 2 + 3 = 5. You can finish one task at time 5. */

package Leetcodes;

import java.util.ArrayList;

public class L3683 {
    public static void main(String[] args) {
        int a[][]=new int [][]{{1,6},{2,3}};
        int sum=0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
        {
            sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
                list.add(sum);
            }
        }
        int min=list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)<min)
            {
                min=list.get(i);
            }
        }
        System.out.println(min);
    }
}
