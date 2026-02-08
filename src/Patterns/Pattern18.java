package Patterns;

public class Pattern18 {
    public void DSApattern(int n) {

        for (int i = n; i >0; i--) {
            char ch='E';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns.Pattern18 p18=new Patterns.Pattern18();
        p18.DSApattern(5);
    }
}
