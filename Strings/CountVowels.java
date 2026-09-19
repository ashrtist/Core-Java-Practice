public class CountVowels
{
    public static void main(String[] args) {
        String str =" Hello World123456";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if("1234567890".indexOf(c)!=-1) //
            {
                count++;
            }
        }
        System.out.println("Consonent: "+count);
    }
}