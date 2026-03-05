package Array;

//Time Complexity: O(N), where N is the size of the array, as we are iterating through the array once.
//Space Complexity: O(1), as we are using a constant

public class LargetElement {
    static int largestInArray(int[] arr)
    {
        int largest=0;
        for (int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }

//    static void BinarySearch(int[] arr)
//    {
//        int start=0,end=arr.length-1;
//        int mid=start + (end-start)/2;
//        while (start<=end)
//        {
//            if(arr[mid]>start)
//        }
//    }

    public static void main(String[] args) {
        int[] arr={5,6,1,2,9,10,2,15,6,3,9};
        System.out.println(LargetElement.largestInArray(arr));
    }
}
