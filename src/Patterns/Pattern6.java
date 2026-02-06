package Patterns;

/*

12345
2345
345
45
5

*/

public class Pattern6 {
    public  void TriangleNum(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                int a = (n - j) + i;
                System.out.print(""+a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns.Pattern6 p6 = new Patterns.Pattern6();
        p6.TriangleNum(5);
    }
}
