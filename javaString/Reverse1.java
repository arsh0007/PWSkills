package javaString;

public class Reverse1{
    public static void main(String[] args) {
        String s1 ="Hello";                 //olleh
        String s2 = new String();
        s1=s1.toUpperCase();
        for (int i = s1.length()-1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}