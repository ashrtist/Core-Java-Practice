public class Reverse {
    public static void main(String[] args) {
        String str =  "Java is powerful";
        //             0123456789
        String s="";
        int count=0;
        //i=        7
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' || i==str.length()-1)
            {
                int start =str.charAt(i)==' '?i-1:i; //to add the space
                for(int j=start;j>=i-count;j--)
                {
                    s = s+str.charAt(j); //  "avaJ si"
                }
                s=s+' ';
                count=0;
            }
            else{
               count++; //8
            }
        }
        System.out.println("reverse :"+s);
    }
}
//  avaJ silufrewop
// 01234567
/*
 */
