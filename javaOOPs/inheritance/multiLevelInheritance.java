package javaOOPs.inheritance;


//Multi-level Inheritance.

class Demo1 //extends Object class
{
    void sleep() 
    {
        System.out.println("it is a Demo1 class.");
    }
}

class Demo2 extends Demo1 //Demo2 inherite the property and behaviour of class of Demo1
{

}

class Demo3 extends Demo2 //Demo3 inherite the property and behaviour of class of Demo2
{

}
public class multiLevelInheritance 
{
    public static void main(String[] args) 
    {
        Demo3 d = new Demo3();
        d.sleep();    
    }
}
