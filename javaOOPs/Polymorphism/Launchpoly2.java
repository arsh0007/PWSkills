package javaOOPs.Polymorphism;

class aeroplane 
{
    void Takeof ()
    {
        System.out.println("Aeroplane can take off all type of runway.");
    }
    void flying () 
    {
        System.out.println("Aeroplane can fly high");
    }
}

class cargopalnee extends aeroplane
{
    void Takeof () 
    {
        System.out.println("cargoplane can take off long runway");
    }
    void flying () 
    {
        System.out.println("cargoplane can't fly high.");
    }
}

class passangerplanee extends aeroplane
{
    void Takeof () 
    {
        System.out.println("passangerplane can take off long runway.");
    }
    void flying () 
    {
        System.out.println("passangerplane can fly high.");
    }
}

class fighterplane extends aeroplane
{
    void Takeof() 
    {
        System.out.println("Fighterplane can take off small runway.");
    }
    void flying() 
    {
        System.out.println("fighterplane can fly high.");
    }
}

class airport 
{
    public void poly(aeroplane ref)
    {
        ref.Takeof();
        ref.flying();

        System.out.println("--------------------------------------------");
    }
}
public class Launchpoly2 
{
    public static void main(String[] args) 
    {
        cargopalnee cp = new cargopalnee();

        passangerplanee pp = new passangerplanee();

        fighterplane fp = new fighterplane();
        
        airport a = new airport();

        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
