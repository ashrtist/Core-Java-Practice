package LinkedHashSet;
import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Sets: ");
        int size=sc.nextInt();

        Set<Integer> hashset = new HashSet<>();
        Set<Integer> linkedhashset = new LinkedHashSet<>();
        Set<Integer> treeset = new TreeSet<>();

        for(int i=0;i<size;i++)
        {
            int value=sc.nextInt();
            hashset.add(value);
            linkedhashset.add(value);
            treeset.add(value);
        }

        System.out.println("HashSet---->"+hashset);
        System.out.println("LinkedHashSet---->"+linkedhashset);
        System.out.println("TreeSet---->"+treeset);
    }
}
