package Patterns;

public class Pattern11 {
    public void UpanddownLeft(int n)

    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    }

    public static void main(String[] args) {
        Pattern11 p11 = new Pattern11();
        p11.UpanddownLeft(5);
    }
}
