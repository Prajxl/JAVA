package Array;

public class SecondLargest {
    static int SecondlargestInArray(int[] arr)
    {
        int largest=0;
        int secondLarge=0;
        for (int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                secondLarge=largest;
                largest=arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr={5,2,1,2,7,4,9,10};
        System.out.println(SecondlargestInArray(arr));
    }
}
