package javaString;

public class Reverse2 {
    public static void main(String[] args) {
        String s1 = "PW Skills";
        String s2 = new String();
        String sarr[] = s1.split(" ");
        for (int i = sarr.length-1; i >=0; i--) {
            s2 = s2 + sarr[i] +" ";
        }
        System.out.println(s2);
    }
}
