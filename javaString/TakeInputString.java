package javaString;

import java.util.Scanner;

public class TakeInputString {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        System.out.println("The Output string is: " +s1);
    }
}
