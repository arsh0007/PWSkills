package javaString;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder brand1 = new StringBuilder("PWSKILL");
        System.out.println(brand1);
        brand1.append("Delhi");   //Here the output is PWSKILLDelhi so StringBuilder is mutable.
        System.out.println(brand1); 
    }
}
