package javaOOPs.inheritance;


class Human 
{
    int age;

    Human()
    {
        System.out.println("Human class constructor.");
    }

    void sleep()
    {
       int age = 18 ;
       System.out.println("Human needs good sleep.");
    }
}
class student extends Human
{
    void display()
    {
        System.out.println("The age is: " +age);
    }
}

public class inheritance2 
{
    public static void main(String[] args) 
    {
        student st = new student();
        st.sleep();
    }
}

