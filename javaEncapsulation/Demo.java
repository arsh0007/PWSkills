package javaEncapsulation;

class Student
{
    private int age;              //private is used to not to expose data directly. 
    private String name;

    public void setData1(int a)
    {
        age = a;
    }
    
    public void setData2(String s)
    {
        name = s;
    }

    public void show()
    {
        System.out.println(age+" "+name);
    }
}
class Demo
{
    public static void main(String[] args) 
    {
        Student str= new Student();
        Student str1 = new Student();
        str.setData1(18);
        str.setData2("Ram");
        str1.setData1(25);
        str1.setData2("Shyam");
        str.show();
        str1.show();
    }
}