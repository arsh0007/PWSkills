package javaOOPs.inheritance;

class Demo1  
{
    int a, b;
    public Demo1() 
    {
        //Super() method call automatically included.
        System.out.println("Parent class Constructor.");
    }

    public Demo1(int x, int y) 
    {
        System.out.println("Parent class Constructor With parameters.");
        a = x;
        b = y;
    }
}


class Demo2 extends Demo1 //Demo2 inherite the properties and behaviour of the demo1 class.
{
    int m, n; 
    public Demo2 () 
    {
        //Super() method call automatically included.
        System.out.println("Child class constructor.");
    }
    public Demo2 (int x, int y) 
    {
        System.out.println("Child class Constructor.");
        m = x;
        n = y;
    }
}



public class constructorExections {
    public static void main(String[] args) {
        
    }
}
