package Recursion_StriverSheet;
import java.util.Arrays;

public class RevArray {

    // Using Two Pointer l and r
    static void func(int[] a,int l,int r)
    {
        if(l>=r) return;
        int temp = a[l];
        a[l]=a[r];
        a[r]=temp;
        func(a,l+1,r-1);
    }
    // Using Single pointer i
    static void function(int[] arr , int i)
    {
        int n=arr.length;
        if(i>=n/2) return;
        arr[i]=arr[i] + arr[n-i-1];
        arr[n-i-1]=arr[i]-arr[n-i-1];
        arr[i]=arr[i]-arr[n-i-1];

        function(arr,i+1);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n=array.length;

        // Reverse using two pointer l and r  o/p=> [5,4,3,2,1]
        func(array,0,n-1);
        System.out.println(Arrays.toString(array));

        // function using one pointer  o/p => [1,2,3,4,5]
        function(array,0);
        System.out.println(Arrays.toString(array));

    }
}
