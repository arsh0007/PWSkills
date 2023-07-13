package javaString;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = new String();
        System.out.println("Enter a string to check Palindrome: ");
        str1 = scan.next();
        String str2 = new String();
        for (int i = str1.length()-1; i >= 0; i--) {      //Reverse a String.
            str2 = str2 + str1.charAt(i);
        }


        if (str1.equals(str2)) {                                             // Check reverse string is equals to the given string.
            System.out.println("Given string '"+ str1 + "' is Palindrome.");
        } else {
            System.out.println("Given string '"+ str1 + "'  is not palindrome");
        }
    }
}
