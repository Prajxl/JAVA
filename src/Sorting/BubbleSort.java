package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] ={5,4,9,2,8,1};
        int n= a.length;

        for (int i=n-1; i>=0;i--)       //  i=6-1 =5
        {
            int didswap=0;
            for (int j = 0; j <= i-1; j++) {  // j=0 -----> 5-1=4
                if (a[j] >a[j+1]) {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    didswap=1;
                }
            }
            if (didswap == 0)        // need to break the loop so declared inside the for loop
            {
                break;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
