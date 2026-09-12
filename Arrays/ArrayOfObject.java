package Arrays;

import Arrays.A.B;

class A 
{
    int l;
    int b;
    float y;
    float z;

    A()
    {
        System.out.println("First constructor");
    }
    A(int l,int b)
    {
        this.l=l;
        this.b=b;
        int c=l+b;
        System.out.println(c);
    }

    A(float y,float z)
    {
        this.y=y;
        this.z=z;
        float w=y+z;
        System.out.println(w);
    }
    static class B extends A
    {
        float d;
        float e;
        B(){
            System.out.println("this is B constructor");
        }
    }
}
public class ArrayOfObject {
    public static void main(String[] args) {
        A a = new B();
    }
}
