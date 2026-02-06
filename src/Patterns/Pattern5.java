package Patterns;

public class Pattern5 {
    public  void TriangleNum(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j>=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns.Pattern5 p5 = new Patterns.Pattern5();
        p5.TriangleNum(5);
    }
}
