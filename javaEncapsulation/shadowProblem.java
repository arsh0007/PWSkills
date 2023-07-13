package javaEncapsulation;

class Student
{
    private int age;              //private is used to not to expose data directly. 
    private String name;
 
    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println(age+" "+name);
    }
}
class shadowProblem
{
    public static void main(String[] args) 
    {
        Student str= new Student();
        Student str1 = new Student();
        str.setAge(18);
        str.setName("Ram");
        str1.setAge(25);
        str1.setName("Shyam");
        int Stud1Age = str.getAge();
        String stud1Name = str.getName();
        System.out.println(Stud1Age);
        System.out.println(stud1Name);
    }
}