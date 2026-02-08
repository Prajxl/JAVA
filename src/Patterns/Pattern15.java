package Patterns;

public class Pattern15 {
    public void DSApattern(int n) {

        for (int i = n; i >0; i--) {
            char ch='A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns.Pattern15 p15=new Patterns.Pattern15();
        p15.DSApattern(5);
    }
}
