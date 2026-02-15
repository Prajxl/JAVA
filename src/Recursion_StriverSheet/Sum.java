package Recursion_StriverSheet;

public class Sum {
    static int sumOf(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sumOf(n-1);  // 3+ func(2) --> n=2+func(1)--> n=1+ func(0)-->if (n==0)==0 --> 1+0=1 , 2+1=3, 3+3=6
    }

    // Parameterized way
    static void sumPara(int i ,int  sum)
    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        sumPara(i-1,sum+i); // 
    }


    public static void main(String[] args) {
        System.out.println(sumOf(3));
        sumPara(4,0);
    }
}
