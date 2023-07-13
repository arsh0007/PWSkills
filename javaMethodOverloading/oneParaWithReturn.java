package javaMethodOverloading;

class solution
{   
    int a,b,c;
    int solSum(int x, int y)
    {
        a=x;
        b=y;
        c=a+b;
        return c;
    }
}
public class oneParaWithReturn {
    public static void main(String[] args) {
        solution sl = new solution();
        int g=sl.solSum(10, 20);
        System.out.println(g);
    }
}
