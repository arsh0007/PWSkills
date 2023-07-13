package javaOOPs.inheritance;


// Heirarchical Inheritance.

class animal //extends object class 
{
    void sleep() {
        System.out.println("All animals need sleep");
    }
}
class Tigers extends animal {

}
class Monkey extends animal{

}
class deer extends animal{

}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        deer d = new deer();
        d.sleep();

        Tigers t = new Tigers();
        t.sleep();

        Monkey m = new Monkey();
        m.sleep();
    }
}
