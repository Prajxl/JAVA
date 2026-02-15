package JAVA8_STREAMS;

import java.util.List;
import java.util.stream.Stream;

public class Parallel_Stream {
    public static void main(String[] args) {
        System.out.println(fact(4));

        long startTime =System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factlist = list.stream().map(Parallel_Stream::fact).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken with sequential stream :"+(endTime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        List<Long> factorialList = list.parallelStream().map(Parallel_Stream::fact).toList();
        endTime=System.currentTimeMillis();
        System.out.println("Time taken with Parallel Stream: "+(endTime-startTime)+"ms");
    }
    public static long fact(int n)
    {
        long result=1;
        for (int i = 2; i <=n ; i++) {
            result *=i;  // 1 = 1*1, 2 = 1*2 , 6 = 2*3,24 = 6*4,120 = 5*24
        }
        return  result;
    }

}
