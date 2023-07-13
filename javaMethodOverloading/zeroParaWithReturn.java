package javaMethodOverloading;

class Additions
{
    int a,b,c;
    int sum()
    {
        a=10;
        b=20;
        c=a+b;
        return c;
    }
}
public class zeroParaWithReturn {
    public static void main(String[] args) {
        Additions ad = new Additions();
        int h=ad.sum();
        System.out.println(h);
    }
}
