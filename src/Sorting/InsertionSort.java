package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={9,8,5,6,15,14};
        int n=arr.length;
        for (int i = 0; i <n;i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
