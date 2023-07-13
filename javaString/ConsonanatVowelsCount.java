package javaString;

public class ConsonanatVowelsCount {
    public static void main(String[] args) {
        int conso=0;
        int vowel=0;
        int speChar=0;
        int number=0;
        String s1 = new String("Hello World!");
        for (int i = 0; i < s1.length(); i++) 
        {
            if (s1.charAt(i)>'a' || s1.charAt(i)<'z' && s1.charAt(i)>'A' || s1.charAt(i)<'Z') 
            {
                if (s1.charAt(i)=='a'|| s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u' ||
                s1.charAt(i)=='A'|| s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U' ) 
                {
                   vowel = vowel++;
                } 
                else 
                {
                    conso = conso++;
                }    
            }
            else if(s1.charAt(i)>0 || s1.charAt(i)<9)
            {
                number = number++;
            }
            else
            {
                speChar =speChar++;
            }
        }
        System.out.println("Number of Vowels in string: "+vowel);
        System.out.println("Number of Consonant in a string: "+conso);
        System.out.println("Number of Special Character in a string: "+speChar);
        System.out.println("Number of digits in to the string: "+ number);
    }
}
