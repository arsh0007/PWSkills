package javaString;

import java.util.Scanner;

public class PangramProgram {
    public static void main(String[] args) {
        // Take input from user.
        Scanner scan = new Scanner(System.in);
        String str = new String();
        str = scan.next();

        //Remove space from the string.
        str = str.replace(" ", "");

        //Convert string in to the Lower case/uppar case.
        str = str.toUpperCase();

        //Convert Strings in to character arrays.
        char ch[]= str.toCharArray();

        //Make a empty array of size 26.
        int arr[] = new int[26];

        //Check all the array is full or not.
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i]-65]++;        
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                System.out.println("");
            } else {
                
            }
        }
        
    }
}
