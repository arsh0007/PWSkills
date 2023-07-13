package javaString;

public class printString {
    public static void main(String[] args) {
        String comName = "PWSKILL";
        System.out.println(comName);
        comName.concat("Delhi");  //So Here the output is only PWSKILL because the string is immutable so we can't change the string.
        System.out.println(comName);
    }
}
