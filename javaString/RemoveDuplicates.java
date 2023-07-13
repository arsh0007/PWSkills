package javaString;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1 = new String("HelloWorld!");
        char ch[]= s1.toCharArray();
        for (int i = 0; i < ch.length; i++) 
        {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j])
                {
                    ch[j]=0;
                }
            }
        }    
        System.out.println(ch);
    }
}
