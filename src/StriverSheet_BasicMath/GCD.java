package StriverSheet_BasicMath;

public class GCD {
    static  int gcd(int n1,int n2)
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
    static int gcd2(int n3,int n4)
    {
        int gcd=1;
        for(int i=1;i<Math.min(n3,n4);i++)
        {
            if(n4 % i == 0 && n3 % i == 0 )
            {
                gcd=i;
            }
        }
        return gcd;
    }


    public static void main(String[] args) {

        System.out.println(gcd(9,12));
        System.out.println(gcd2(9,12));
    }
}
