package Recursion_StriverSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap= new HashMap<>();;
        hmap.put(1,"P");
        hmap.put(2,"J");
        hmap.put(3,"4");

        hmap.get(1);
        System.out.println(hmap.get(2));
        System.out.println(hmap.containsKey(1));
        System.out.println(hmap.containsValue("P"));
        Set<Integer> keys = hmap.keySet();
        for(int i: keys) {
            System.out.println(hmap.get(i));
        }
        Set<Map.Entry<Integer,String>> entries = hmap.entrySet();
        for(Map.Entry<Integer,String> entry : entries)
        {
            System.out.println();
        }
    }
}
