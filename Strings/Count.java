import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        int vowels=0;
        int consonent=0;
        int digits=0;
        int spaces=0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowels++;
            }
            else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                consonent++;
            }
            else if(ch>='0' && ch<='9')
            {
                digits++;
            }
            else if(ch==' ')
            {
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonent);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
