package Patterns;

public class Pattern16 {
    public void DSApattern(int n) {
        char ch='A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);

            }
            System.out.println();
            ch++;
        }
    }

    public static void main(String[] args) {
        Patterns.Pattern16 p16=new Patterns.Pattern16();
        p16.DSApattern(5);
    }
}
