package javaBasic;
class Demo
{
    static int a;                                            //Initialization Of the Static variables a and b.
    static int b;

    int m;                                                   //Initialization Of the instance variables m and n.
    int n;

    static                                                   //It is a static block.
    {
        a=10;                                                //Declaration of the static variable a and b.
        b=20;
        System.out.println("Control in Static Block.");
    }
                                                              //It is a non static block.
    {
        m=100;                                                //Declaration of the instance variables m and n.
        n=200;
        System.out.println("Control in Non Static Block.");
    }
    static void disp1()                                      //Initialization of the static method.
    {
        System.out.println("Value of static variable" +a);
        System.out.println("Value of static variable" +b);
        //System.out.println(m);                              //We can't use non static variable in to the static method.
    }
    void disp2()                                              //Initialization of the non static method.
    {
        System.out.println("Value of instance variable"+m);
        System.out.println("Value of instance variable"+n);
    }
}
public class Launch1 
{
    public static void main(String[] args) 
    {
        Demo d = new Demo();
        Demo.disp1();
        d.disp2();
    }
}
