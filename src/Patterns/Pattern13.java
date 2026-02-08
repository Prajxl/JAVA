package Patterns;

public class Pattern13 {
    public void DSApattern(int n) {
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern13 p13=new Pattern13();
        p13.DSApattern(5);
    }

}
