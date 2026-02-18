package StriverSheet_BasicMath.Hashing;

import Recursion_StriverSheet.Hashing;

import java.util.HashMap;

public class CountingFrequency {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}
