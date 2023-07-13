package JavaAreaApplication.WithOOPs;


import java.util.*;

abstract class shape                   //Abstraction 
{
    float area;                        //Used in all class so make variable in parent class.

    abstract public void input();      //Abstraction
    abstract public void compute();    //Abstraction
    
    void display()                     //Used in all class so make method in parent class.
    {
        System.out.println("The Area of the Shape: " +area);
    }
}

class Rectangle extends shape         //Inherit the shape class in to the Rectangle class
{
    float length ;
    float breath ;

    public void input () 
    {
        System.out.println("Calculation of the Rectangle app: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        length = scan.nextFloat();
        System.out.println("Enter the breath of the Rectangle: ");
        breath = scan.nextFloat();
    }

    public void compute ()
    {
        area = length * breath;
    }
}

class Square extends shape          //Inherit the shape class in to the square class
{
    float length ;
    
    public void input ()
    {
        System.out.println("Calculation of the Square app: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Square: ");
        length = scan.nextFloat();
    }

    public void compute ()
    {
        area = length * length;
    }
}

class Circle extends shape            //Inherit the shape class in to the circle class
{
    float radius ;

    public void input ()
    {
        System.out.println("Calculation of the Circle app: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        radius = scan.nextFloat();
    }

    public void compute ()
    {
        area = 3.14f * radius * radius;
    }
}

class Geometry                    //polymorphism
{
    public void poly(shape ref)  //parent type refrence is mandatory for achive polymorphism 
    {
        ref.input();             //Loose Coupling because of parent type refrence.
        ref.compute();
        ref.display();
    }
}

public class LaunchEffApp 
{
    public static void main(String[] args) 
    {        
        Rectangle rect = new Rectangle();

        Square sq = new Square();

        Circle cir = new Circle();

        Geometry geo = new Geometry();
        geo.poly(rect);
        geo.poly(sq);
        geo.poly(cir);
    }
}
