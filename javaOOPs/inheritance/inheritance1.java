package javaOOPs.inheritance;

class Human
{
    int age;void sleep()
    {
        int age =18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human       // sleep method of Human class is inherite in to the Student class. or human is a student.
{

}
public class inheritance1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sleep();    
    }
}
