package javaOOPs.inheritance;


// Specialized Method In java Inheritance.

class Aeroplaneee 
{
    void Flying () 
    {
        System.out.println("Plane can fly high ");
    }

    void Takeoff() 
    {
        System.out.println("Plane can takeoff ");
    }
}



class cargoplan extends Aeroplaneee 
{
    void carryGoods() 
    {
        System.out.println("Cargoplane can carry goods.");
    }
}

class passangerPlan extends Aeroplaneee
{
    void carrypass() 
    {
        System.out.println("Passangerplane can carry passanger.");
    }
}


public class specializedMethodInInheritance 
{
    public static void main(String[] args) 
    {

        cargoplan cp = new cargoplan();
        cp.Flying();
        cp.Takeoff();
        cp.carryGoods();

        passangerPlan pp = new passangerPlan();
        pp.Flying();
        pp.Takeoff();
        pp.carrypass();

        
    }
}
