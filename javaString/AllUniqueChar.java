package javaString;

public class AllUniqueChar {
    public static void main(String[] args) {
        String s1 = new String("Hello World!");
        int Unique = 0;
        int noUnique = 0;
        for (int i = 0; i < s1.length()-1; i++) 
        {
            if (s1.charAt(i)==s1.charAt(i+1)) 
            {
                noUnique++;   
            } 
            else 
            {
                Unique++;
            }
        }
        if (noUnique>0) {
            System.out.println("String is not contain all unique character.");
        } else {
            System.out.println("String is contain all unique character.");
        }
          
    }
}
