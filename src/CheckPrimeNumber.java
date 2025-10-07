import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n==1||n==0) {
            isPrime = false;
        }else {
            for (int i = 2; i <= n / 2; i++) {   //
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("This is a Prime Number");
        }else
        {
            System.out.println("NOt a Prime Number");
        }

    }
}
