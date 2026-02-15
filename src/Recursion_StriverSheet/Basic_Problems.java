package Recursion_StriverSheet;

public class Basic_Problems {
    static void PrintName(int i,int n)
    {
      if(i>n)
      {
          return;
      }
        System.out.println("Raj");
        PrintName(i+1,n);
    }

    // Print NUmber 1 2 3
    static void PrintNumber(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        PrintNumber(i+1,n);
    }

    // Print in terms of N to 1 N=4 3 2 1
    static  void ReverseTerm(int i,int n)
    {
        if(i==0)
        {
            return;
        }
        System.out.println(i);
        ReverseTerm(i-1,n);
    }

    // Print 1 to N  using backtracking without using i+1 in fucntion
    static void PrintNumBackTrack(int i,int n)
    {
        if(i<1)
        {
            return;
        }
        PrintNumBackTrack(i-1,n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        // Print Name N times using Recursion
        int n=3;
        PrintName(1,n);
        PrintNumber(1,n);
        ReverseTerm(n,n);
        PrintNumBackTrack(n,n);
    }

}
