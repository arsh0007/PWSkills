package javaBasic;
import java.util.Scanner;

class Farmer
{
    int PrincipleAmount;
    float TimeDuration;
     // float RateOfInterest;  //we can use here static variable because the value of RateOfInterrest is not change. it is make program efficient. 
    static float RateOfInterest =8.5f;
    float SimpleInterest;

    void inputvalues()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount required: ");
        PrincipleAmount=scan.nextInt();
        System.out.println("Please enter the time duration: ");
        TimeDuration=scan.nextFloat();
        //RateOfInterest =8.5f;
    }
    void computeSimpleInterest()
    {
        SimpleInterest = (PrincipleAmount*RateOfInterest*TimeDuration)/100;
    }
    void displaySimpleInterest()
    {
        System.out.println("Simple Interest is: " +SimpleInterest);
    }
}



public class LaunchFarmer
{
    public static void main(String[] args) 
    {
        Farmer f1 = new Farmer();
        f1.inputvalues();
        f1.computeSimpleInterest();
        f1.displaySimpleInterest();
    }
}
