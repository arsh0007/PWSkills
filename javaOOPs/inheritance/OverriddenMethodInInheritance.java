package javaOOPs.inheritance;

//Overridden Method in Java Inheritance.

class Aeroplanee 
{
    public void flying() 
    {
        System.out.println("Aeroplane can fly ");
    }

    public void takeOfff() 
    {
        System.out.println("Aeroplane can takekoff");
    }
}



class cargoplanee extends Aeroplanee
{
    public void flying() 
    { // Here we overridden the flying() method in to the child class.
        System.out.println("CargoPlane can't fly high.");
    }
}


class passangerPlanee extends Aeroplanee 
{
    public void takeOfff()       
    { // Here we overridden the takeofff() method in to the child class.          
        System.out.println("PassangerPlane can't takeoff on the yatch.");
    }
}



public class OverriddenMethodInInheritance 
{
    public static void main(String[] args) 
    {
        cargoplanee cp = new cargoplanee();
        cp.flying();
        cp.takeOfff();

        passangerPlanee pp = new passangerPlanee();
        pp.flying();
        pp.takeOfff();
    }
}
