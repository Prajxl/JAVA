package Patterns;

public class Square {
    public void StarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0 ; j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.StarPattern(5);
    }
}
