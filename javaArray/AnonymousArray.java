package javaArray;

class calc{
    public int add(int nums[]){
        int Ans=0;
        for (int n : nums) {
            Ans = Ans + n;
        }
        return Ans;
    }
}
public class AnonymousArray {
        public static void main(String[] args) {
        calc obj = new calc();
        int result = obj.add(new int[] {12,34,56,78});//new int[] {12,34,56,78} it is anonymous array. it is use only one time in a program.
        System.out.println(result);
    }
}
