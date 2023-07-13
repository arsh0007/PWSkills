package javaString;

public class printDuplicate {
    public static void main(String[] args) {
        String s1 = new String("Helloworld");
        char ch [] = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) 
        {
            for (int j = i+1; j < ch.length; j++) 
            {
                if (ch[i]==ch[j]) 
                {
                    System.out.print(ch[i]);
                    System.out.println(" ");
                }    
            }    
        }
    }
}
