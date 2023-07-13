package javaOOPs.Polymorphism;

class Aeroplane 
{
    void TakeOff() 
    {
        System.out.println("Aeropalne can takeoff in many runway.");
    }
    void fly() 
    {
        System.out.println("Aeroplane can fly high.");
    }
}

class cargopalne extends Aeroplane    //Aeroplane class inherite in to the cargoplane class.
{
    void TakeOff()   //Method Overriding
    {
        System.out.println("Cargoplane can't takeoff in small runway.");
    }
    void fly()   //Method Overriding
    {
        System.out.println("Cargoplane can't fly high.");
    }
}

class passengarplane extends Aeroplane    //Aeroplane class inherite in to the passangerplane class.
{
    void TakeOff()   //Method Overriding
    {
        System.out.println("passangerplane can takeoff in small runway.");
    }
    void fly()   //Method Overriding
    {
        System.out.println("passangerplane can fly high. ");
    }
}


public class Launchpoly 
{
    public static void main(String[] args) 
    {
        cargopalne cp = new cargopalne();

        passengarplane pp = new passengarplane();

        Aeroplane ref;   //parent class object ref;

        ref = cp;        
        ref.TakeOff();
        ref.fly();

        System.out.println("---------------------------------------------------------");
        
        ref = pp;
        ref.TakeOff();
        ref.fly();
        
    }
}
