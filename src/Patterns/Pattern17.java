package Patterns;

public class Pattern17 {
    public void DsaPattern(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int space = 1; space <=(n-i) ; space++) {
                System.out.print(" ");
            }
            char ch='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            ch -=2;
            for (int j = 1; j <i ; j++) {
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern17 p17 = new Pattern17();
        p17.DsaPattern(5);
    }
}
