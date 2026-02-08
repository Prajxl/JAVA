package Patterns;

public class Pattern14 {
        public void DSApattern(int n) {

            for (int i = 1; i <= n; i++) {
                char ch='A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Patterns.Pattern14 p14=new Patterns.Pattern14();
            p14.DSApattern(5);
        }

}
