package JavaAreaApplication.WithoutOOPs;

import java.util.Scanner;

class Rectangle 
{
    float length ;
    float breath ;
    float area;
    
    void input ()
    {
        System.out.println("Calculation of the Rectangle app: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        length = scan.nextFloat();
        System.out.println("Enter the breath of the Rectangle: ");
        breath = scan.nextFloat();
    }

    void compute ()
    {
        area = length * breath;
    }

    void display ()
    {
        System.out.println("The area of the Reactangle is: "+ area);
    }
}

class Square
{
    float length ;
    float area;

    void input ()
    {
        System.out.println("Calculation of the Square app: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Square: ");
        length = scan.nextFloat();
    }

    void compute ()
    {
        area = length * length;
    }

    void display ()
    {
        System.out.println("The area of the Square is: "+ area);
    }
}

class Circle
{
    float radius ;
    float area;

    void input ()
    {
        System.out.println("Calculation of the Circle app: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        radius = scan.nextFloat();
    }

    void compute ()
    {
        area = 3.14f * radius * radius;
    }

    void display ()
    {
        System.out.println("The area of the Circle is: "+ area);
    }
}

public class Launchapp 
{
    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle();  

        rect.input();                   //Tight coupling because we can call only reactangle object method 
        rect.compute();                //Tight coupling because we can call only reactangle object method 
        rect.display();                //Tight coupling because we can call only reactangle object method 


        Square sq = new Square();

        sq.input();                  //Tight coupling because we can access only square method 
        sq.compute();                //Tight coupling because we can access only square method
        sq.display();                //Tight coupling because we can access only square method


        Circle cir = new Circle();
        
        cir.input();                //Tight coupling because we can access only circle method
        cir.compute();              //Tight coupling because we can access only circle method
        cir.display();              //Tight coupling because we can access only circle method
    }
}

