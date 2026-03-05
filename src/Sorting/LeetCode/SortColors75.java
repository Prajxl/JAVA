package Sorting.LeetCode;

import java.util.Arrays;

public class SortColors75 {

    static void quickSort(int[] arr,int low,int high)
    {

        if(low>=high)
        {
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while (s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while (arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            quickSort(arr,s,high);
            quickSort(arr,low,e);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
