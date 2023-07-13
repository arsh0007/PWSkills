package javaObjects;
class Test {
    int a;
    String name="Rahul";
    public static void main(String[] args) {
        //Declare the variable.
        //create the object.
        
        int num=9;    //Primitive Variable 
        Test obj = new Test();   // Reference Variable
        Test obj1 = new Test();  //Reference Variable.
        
        obj1.name= "Arsh";

        //System.out.println(name);     // we can't use this because static memory cant access non static memory.
        System.out.println(obj.name);  // so we use object variable name to use name value.
        System.out.println(obj.a);  // As welll as we use object variable name to access the value of a.

        System.out.println(obj1.name); 
        System.out.println(obj1.a);
    }
}