package javaOOPs.Final;

// final class Animals{
//     void sleep()
//     {
//         System.out.println("Animal is sleeping.");
//     }
// }
class Animals{
    final int age = 20;
    final void sleep()
    {
        // age = 50; We can't change the value of final keyword variable. 
        System.out.println("Animal is sleeping.");
    }
}
class Tiger extends Animals
{
    //  We can't over write the final parent method in to the child class. 
    // void sleep()
    // {

    // }
}


public class final1 {
    public static void main(String[] args) {
        Tiger ref = new Tiger();
        ref.sleep();
    }
    
}
