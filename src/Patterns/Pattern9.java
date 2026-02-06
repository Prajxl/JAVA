package Patterns;

public class Pattern9 {
    public void starpyramid(int n){
        for (int i = n; i >= 0; i--) {
            for (int space = n-i ; space>0 ; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern9 p9 = new Pattern9();
        p9.starpyramid(5);
    }
}
