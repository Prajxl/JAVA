package StriverSheet_BasicMath;

public class GCD {
    static  int palindrome(int n1,int n2)
    {
        int gcd=0;
        for (int i = Math.min(n1,n2); i >0 ; i--) {
            if(n1 % i==0 && n2 % i==0)
            {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(9,12));
    }
}
