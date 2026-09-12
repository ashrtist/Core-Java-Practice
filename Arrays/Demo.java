package Arrays;
class DemoApp
    {
        void add(int ...a)
        {
            int sum=0;
            for(int x :a)
                {
                    sum+=x;
                }
            System.out.println("Sum is "+sum);
        }
    }
public class Demo
    {
        public static void main(String args[])
        {
            DemoApp d = new DemoApp();
            d.add(1,2);
            d.add(1,2,3);
            d.add(1,2,3,4);
            d.add(1,2,3,4,5);
        }
    }