package javaOOPs.Abstraction;


abstract class Aeroplane //it is a not a 100% abstraction because of landing() method
{
    //Note- Abstract class, Abstract method can persent but Abstract variable can't be persent in class.
    // abstract int age;
    // Note - We can't make Abstract Constructor in to the class because of super() method.

    abstract void TakeOff(); // Method Signature only 
   
    abstract void fly();   // Method signature only  

    void landing()   // Method with body and signature both.
    {
        System.out.println("Aeroplane is landing.");
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
    void alert () // it is a specialized method because it's not persent in to the parent class. 
    {
        System.out.println("Alert....");
    }
}
    
public class Abstraction2 {
    public static void main(String[] args) {
        Aeroplane cp = new cargopalne();
        cp.TakeOff();
        cp.fly();
        cp.landing();

        Aeroplane pp = new passengarplane();
        pp.TakeOff();
        pp.fly();
        pp.landing(); 
        ((passengarplane) pp).alert();  //DownCasting....
    }
    
}
