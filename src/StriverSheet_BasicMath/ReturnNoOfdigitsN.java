package StriverSheet_BasicMath;

// Given an integer N, return the number of digits in N. - Brute Force Approach
public class ReturnNoOfdigitsN {
    static int countdigits()
    {
        int N=123;
        N=Math.abs(N);
        int count=0;
        while(N>0)
        {
            N/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println( ReturnNoOfdigitsN.countdigits());
    }
}
