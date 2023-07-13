package javaString;

public class palindromeNumber 
{
    public static void main(String[] args) 
    {
        
        String str1 = new String("2552");
        String str2 = new String();

        for (int i = str1.length()-1; i >= 0; i--) 
        {     
            str2 = str2 + str1.charAt(i);
        }


        if (str1.equals(str2)) 
        {                                             
            System.out.println("Given string '"+ str1 + "' is Palindrome.");
        } 
        else 
        {
            System.out.println("Given string '"+ str1 + "'  is not palindrome");
        }
    }
}
