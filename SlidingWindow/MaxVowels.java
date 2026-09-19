package SlidingWindow;

public class MaxVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int k=3;
        int count=0;
        int maxCount=0;

        for(int i=0;i<k;i++)
        {
            char c=str.charAt(i);
            if("AEIOUaeiou".indexOf(c)!=-1)
            {
                count++;  
            }
        }
        maxCount=count; //1
        System.out.println("maxCount "+maxCount);

        // H e l l o   w o r l d
        // 0 1 2 3 4 5 6 7 8 9 10
        //      i=3 3<11
        for(int i=k;i<str.length();i++)
        {
            //count=0;
            char enteringChar=str.charAt(i); //l
            if("AEIOUaeiou".indexOf(enteringChar)!=-1) // 
            {
                count++; //0
            }
            //count=count+str.charAt(i)-str.charAt(i-k); 
            char leavingChar=str.charAt(i-k);
            if("AEIOUaeiou".indexOf(leavingChar)!=-1) // 
            {
                count--; //lost vowel
            }
    
            if(count>maxCount)
            {
                maxCount=count;
            }
        }
        System.out.println("maxCount "+maxCount);
    }
}
