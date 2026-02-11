package StriverSheet_BasicMath;

public class PrimeNumber {
    public static void primeNumber(int n) {
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)
            {
                count++;
            }
        }
        Condition(count);
    }
    public static void Condition(int count)
    {
        if (count==2)
        {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
    public static void OptimisedApproach(int n)
    {
        int count=0;
        for (int i=1;i*i<=n;i++)
        {
            if(n%i==0){
                count++;
                if(n/i != i)
                {
                    count++;
                }
            }
        }
        Condition(count);

    }
    public static void main(String[] args) {
        primeNumber(8);
        OptimisedApproach(29);
    }
}
