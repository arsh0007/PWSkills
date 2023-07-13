package javaOOPs.Abstraction;

abstract class Aeroplane //it is a 100% abstraction.
{
    abstract void TakeOff(); 
   
    abstract void fly();  
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

public class Abstraction1 {
    public static void main(String[] args) {
        Aeroplane cp = new cargopalne();
        cp.TakeOff();
        cp.fly();

        Aeroplane pp = new passengarplane();
        pp.TakeOff();
        pp.fly();
    }
}



    