package Recursion_StriverSheet;

public class Factorial {
    static int fact(int n)
    {
        if(n<=1) return 1;
        return n*fact(n-1);  //  5 *fact(4)=120 , 4*fact(3)=24 , 3*fact(2)=6 , 2*fact(1)=2*1=2
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
