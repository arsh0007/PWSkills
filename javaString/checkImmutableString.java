package javaString;

public class checkImmutableString {
    public static void main(String[] args) {
        String s1 = new String("PW");     //With Constractor
        String s2 = new String("PW");     //With Constractor 
        System.out.println(s1==s2);       //Compare two string s1 and s2.


        String s3 = "PW";                //Without constractor 
        String s4 = "PW";                //Without constractor 
        System.out.println(s3==s4);      //Compare two string s3 and s4.

    }
}
