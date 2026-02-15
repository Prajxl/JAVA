package Recursion_StriverSheet;

public class fibanocci {
    static int fib(int n)
    {
        if(n<=1) return n;
        int lastFirst = fib(n-1);
        int lastSecond = fib(n-2);
        return lastFirst+lastSecond;
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
