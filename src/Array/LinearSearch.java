package Array;

public class LinearSearch {

    static int Search(int[] arr,int target)
    {
        for (int i=0;i< arr.length;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={2,3,5,4,6,7};
        int target=6;
        System.out.println(Search(arr,target));
    }
}
