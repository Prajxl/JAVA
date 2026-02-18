package StriverSheet_BasicMath.Hashing;

import java.util.HashMap;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,4};
        int maxElement=-1;
        int maxCount=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num,map.get(num));
        }
        for (int keys : map.keySet())
        {
            if (map.get(keys)>maxElement)
            {
                maxElement=keys;
                maxCount=map.get(keys);
            }
        }
        System.out.println("maxElement "+ maxElement+" "+maxCount);
    }
}
