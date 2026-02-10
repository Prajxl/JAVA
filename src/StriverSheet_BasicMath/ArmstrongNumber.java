package StriverSheet_BasicMath;

public class ArmstrongNumber {

    public static boolean armStrong (int n){
        int temp=n;
        int sum=0,count=0;
        int rev=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }

        temp =n;

        while (temp>0){
            int lastdigit=temp%10;  //153= 3 , 2 ,1
            sum +=Math.pow(lastdigit,count);
            temp = temp /10;
        }
        return sum==n;
    }

    public static boolean WithoutWhile(int n)
    {
        int count=String.valueOf(n).length();
        int sum=0;
        int temp=n;

        while (temp>0){
            int lastdigit=temp%10;  //153= 3 , 2 ,1
            sum +=Math.pow(lastdigit,count);
            temp = temp /10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int n=153;
        System.out.println(armStrong(n));
        System.out.println(WithoutWhile(n));
    }
}
