package Patterns;

public class Pattern10 {
    public void UpandDown(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int space = n-i; space >0 ; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=0 ; i--) {
            for (int space = n-i; space >0 ; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern10 p10 = new Pattern10();
        p10.UpandDown(5);
    }

}
