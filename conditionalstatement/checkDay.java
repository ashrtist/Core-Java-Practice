package conditionalstatement;
import java.util.*;
public class checkDay {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.println("Enter Number 1-7 : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
        while(true);
    }
}
