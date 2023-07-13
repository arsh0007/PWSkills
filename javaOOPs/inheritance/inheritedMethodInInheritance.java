package javaOOPs.inheritance;

// Inherited Method in Inheritance.
class Aeroplane 
{
    public void takeOff() 
    {
        System.out.print("Aeroplane can takeOff.");
    }

    public void Fly() 
    {
        System.out.println("Aeroplane can fly.");
    }
}

class cargoPlane extends Aeroplane
{

}

class  passangerPlane extends Aeroplane
{

}
public class inheritedMethodInInheritance 
{
    public static void main(String[] args) 
    {
        cargoPlane cp = new cargoPlane();
        cp.takeOff();
        cp.Fly();
        passangerPlane pp = new passangerPlane();
        pp.takeOff();
        pp.Fly();
    }
}
