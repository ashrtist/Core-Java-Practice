package Java_Interesting_Questions;



class Demo
{
    int a=10;
    static int b=20;

     void sBehaviour()
    {
        Demo d=new Demo();
        d.a=100;
        System.out.println(d.a);
        System.out.println(b);
    }
}
public class staticApp {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.sBehaviour();
    }
}
