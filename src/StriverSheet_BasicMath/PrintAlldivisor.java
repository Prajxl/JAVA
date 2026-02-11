package StriverSheet_BasicMath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintAlldivisor {
    static public void divisor(int n)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
                if(n/i != i)
                {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
     divisor(36);
    }
}
