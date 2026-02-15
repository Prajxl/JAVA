package Recursion_StriverSheet;

public class Palindrome_check {
    static  boolean palindrome(char[] arr,int i)
    {
        int n=arr.length;
        if(i>=n/2) return true;
        if(arr[i] != arr[n-i-1]) return false;
        return palindrome(arr,i+1);
    }
    public static void main(String[] args) {
        String s ="MadaM";
        char[] arr=s.toCharArray();
        System.out.println(palindrome(arr,0));
    }

}
