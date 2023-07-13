package javaConstructor;

class Demo
{
    private int a;
    private int b;
     
    public Demo()
    {
        System.out.println("Zero Parameter Constructor by programmer.");
    }
    public Demo(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Launch2 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.display();
        Demo d2 = new Demo(20, 30);
        d2.display();
    }
}
