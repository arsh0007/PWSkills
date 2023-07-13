package javaString;

public class ConcatenateString {
    public static void main(String[] args) {
        String s1 = "PWJAVA";
        String s2 = s1.concat("SKILLS");
        String s3 = new String("PWJAVA");
        s3 = s3.concat("SKILLS");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
