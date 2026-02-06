package Patterns;

public class TriangleStar {
    public void TriangleStarPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TriangleStar t2 = new TriangleStar();
        t2.TriangleStarPattern(5);
    }
}
