package javaConstructor;

class Student 
{
    private String name;
    private int age;
    
    public Student()
    {
        System.out.println("Zero parameter comstructor");
        age = 18;
        name = "Shri Ram";
    }
    public Student(String name)
    {
        this.name=name;
        age=78;
    }
    public Student(String name, int age)
    {
        this.name=name;        
        this.age=age;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
    
}
public class Launch3 {
    public static void main(String[] args) {
        Student std = new Student();
        Student std1 = new Student("Hello Ram.");
        Student std2 = new Student("How are you?",48);
        std.display();
        std1.display();
        std2.display();
    }
}
