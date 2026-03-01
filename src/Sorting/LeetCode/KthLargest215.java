package Sorting.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthLargest215 {
    static int quickSort(int[] arr,int low,int high,int targetIndex)
    {
        if(low==high)
        {
            return arr[low];
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while (s<=e)
        {
            while (arr[s]<pivot)
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
//            quickSort(arr,low,e,targetIndex);
//            quickSort(arr,s,high,targetIndex);
        }
        if(targetIndex<=e)
        {
            return quickSort(arr,low,e,targetIndex);
        } else if (targetIndex>=s) {
            return quickSort(arr,s,high,targetIndex);
        }else {
            return arr[targetIndex];
        }
    }

    public static void main(String[] args) {
        int[] arr={4,5,1,3,9,2};
        int n=arr.length;
        int k=3;
        int targetIndex=n-k;
        int p=quickSort(arr,0,arr.length-1,targetIndex);
        System.out.println(Arrays.toString(arr));
         //6-3=3
        System.out.println("K th Value"+p);
    }

}
