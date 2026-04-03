package Array;

public class CountMaxConsecutiveOne {

    static int count(int[] arr)
    {
        int count=0;
        int max_count=0;
        for(int i=0;i< arr.length;i++) {
            if (arr[i] != 1) {
                count=0;
            }
            else {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,1,0,1,1,1,2,4,1,1,1,1,1};
        System.out.println(count(arr));
    }
}
