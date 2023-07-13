package javaString;

public class SortStringAlphabets {
    public static void main(String[] args) {
        String s1 = new String("ACBDEGF");
        s1 = s1.replace(" ", "");
        
        char ch [] = s1.toCharArray();
        char temp;
        for (int i = 0; i < ch.length-1; i++) 
        {
            for (int j = i+1; j < ch.length; j++) 
            {
                if (ch[i]>ch[j]) {
                    temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }   
        }
        System.out.println(ch);
    }
}
