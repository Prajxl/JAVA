package Patterns;

public class Pattern20 {
    static void DsaPattern(int n)
    {
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <=(n-i)*2 ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n; i >0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <=(n-i)*2 ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern20.DsaPattern(5);
    }
}
