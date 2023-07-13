package javaMethodOverloading;

class calculateSum
{
    int a,b;
    
    int add(int x, int y)
    {
        return x+y;
    }
    float add(int x, float y)
    {
        return x+y;
    }
    double add(int x, double y)
    {
        return x+y;
    }
    double add(int x,int y, double z)
    {
        return x+y+z;
    }
}
public class methodOverloading 
{
    public static void main(String[] args) 
    {
        calculateSum sum = new calculateSum();
        int s1 = sum.add(14, 56);
        System.out.println(s1);
        int s2 = sum.add(85, 6658);
        System.out.println(s2);
     
    }
}
