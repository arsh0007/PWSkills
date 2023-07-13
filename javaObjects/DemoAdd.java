package javaObjects;
class calculate{
    public int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}
public class DemoAdd {
    public static void main(String[] args) {
        calculate obj = new calculate();
        int result = obj.add(15, 60);
        System.out.println("Addition of two number is: "+result);
    }
}