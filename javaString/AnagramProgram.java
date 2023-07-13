package javaString;

/*  Program to check input strings are Anagram or not.

Test Cases:
   
Test case1:
    Input:
    Str1: The ClassRoom.
    Str2: School Master.
    Output:
    Given both arrays are Anagram.

Test Case2:
    Input: 
    Str1: HelloWorld.
    str2: HelloPwSkill.
    Output:
    Given both arrays are not Anagram.
*/

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
    public static void main(String[] args) {
        //STEP0: Input the string from the user.
        Scanner scan = new Scanner(System.in);
        String str1 = new String();
        System.out.print("Enter First string: ");
        str1 = scan.next();
        
        String str2 = new String();
        System.out.print("Enter Second string: ");
        str2 = scan.next();

        //STEP1: Remove the space in to the strings. 
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        //STEP2: Convert Strings in to Lower Case/Uppar Case.
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //STEP3: Convert strings in to the Character array.
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        //STEP4: Sort the both character arrays.
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //STEP5: Compare the both arrays.
        if (Arrays.equals(arr1,arr2)) 
        {
            System.out.println("Given both arrays are Anagram.");
        } 
        else 
        {
            System.out.println("Given both arrays are not Anagram");
        }
    }
}
 
