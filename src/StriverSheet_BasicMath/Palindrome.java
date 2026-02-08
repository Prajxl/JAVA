package StriverSheet_BasicMath;

public class Palindrome {
    static boolean palindromeCheck(int n)
    {
        int rev=0,dup=n;
        while (n>0)
        {
            int lsDigit=0;
            lsDigit = n%10;
            rev=rev*10+lsDigit;
            n=n/10;
        }
        return rev==dup;
    }

    public static void main(String[] args) {
        int n=4574;
        if(palindromeCheck(n))
        {
            System.out.println(n+ " Palindrome");
        }else{
            System.out.println(n+ " Not Palindrome");
        }
    }
}
