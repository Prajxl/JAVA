package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        for (int i = 0; i < arr.length-2; i++) {
            int mindIndex=i;
            for(int j=i+1; j<=arr.length-1;j++)
            {
                if(arr[mindIndex]>arr[j])
                {
                    mindIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindIndex];
            arr[mindIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
