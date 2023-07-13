package javaString;

public class compareTwoString {
    public static void main(String[] args) {
        String s1 = "Hello!India";
        String s2 = new String("Hello!India");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "Hello!";
        String s4 = new String("HEllo!PW");
        System.out.println(s3.equals(s4));

    }
}
