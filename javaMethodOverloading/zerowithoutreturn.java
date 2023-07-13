package javaMethodOverloading;

class Additionsn
{
    int a,b,c;
    void add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
    }
}
class zerowithoutreturn
{
    public static void main(String[] args) 
    {
        Additionsn ad = new Additionsn();
        ad.add();
    }
}