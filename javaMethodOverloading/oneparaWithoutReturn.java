package javaMethodOverloading;

class Addition
{
    int a,b,c;
    void add(int x)
    {
        a=x;
        b=20;
        c=a+b;
        System.out.println(c);
    }
}
public class oneparaWithoutReturn 
{
    public static void main(String[] args) 
    {
        Addition ad =new Addition();
        ad.add(10);
    }
}
