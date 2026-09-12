package Strings;
import java.util.Scanner;
public class StringBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        args=new String[3];
        System.out.println("Enter the String");
        for (int i = 0; i < args.length; i++) {
            args[i]=sc.nextLine();
        }
        System.out.println("Display String: ");
        for(int i=0;i<args.length;i++)
        {
            System.out.print(args[i]+" ");
        }
    }
}