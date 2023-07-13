package javaConstructor;

class Student
{
    private int age;                      // private Age or name are the Instance variable (Private data member.)
    private String name;

    Student(String name, int age)        /*NO specific return type */
    {
        this.name=name;
        this.age=age;
    }
    
    public int getAge() 
    {
        return age;
    }
    
    // public void setAge(int age) 
    // {
    //     this.age = age;
    // }
    
    public String getName() 
    {
        return name;
    }
    
    // public void setName(String name) 
    // {
    //     this.name = name;
    // }
}


public class Launch1
{
    public static void main(String[] args) {
        Student sd = new Student("Shri Ram", 16);     // {Student("Shri Ram", 16);}Here constructor call during the creation of the object.
        // sd.setName("Shri Ram");
        // sd.setAge(15);
        int age = sd.getAge();
        System.out.println(age);
        String name = sd.getName();
        System.out.println(name);
    }
}