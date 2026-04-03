package Array;

public class CheckSortedOrNot {
    static boolean isSorted(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    static boolean isSortedDescending(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(isSortedDescending(arr));
    }
}
