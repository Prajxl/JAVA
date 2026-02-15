package JAVA8_STREAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        //1.Collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //ForEach

        list.stream().forEach(x -> System.out.println(x));

        //3.reduce-Combines elements to produce a single result
        list.stream().reduce((x,y)->x+y);
        Optional<Integer> optionalI = list.stream().reduce(Integer::sum);

        //count

        //5. anyMatch , allMatch , noneMatch
      boolean b=  list.stream().anyMatch(x->x%2==0);
        System.out.println(b);
       boolean c= list.stream().allMatch(x->x>0);
        System.out.println(c);
        boolean d =list.stream().noneMatch(x->x<0);
        System.out.println(d);

        // FInd FIrst and Any

        System.out.println(list.stream().findFirst());
        System.out.println(list.stream().findAny());

        // Ex: 1 Filtering and getting names
        List<String> names = Arrays.asList("Anna","Ban","prajwal","Annna");
        System.out.println(names.stream().filter(x->x.length()>3).toList());

        //EX.2 Squaring and Sorting numbers
        List<Integer> numbers = Arrays.asList(4,6,1,5,2);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        // Ex.3 Summing values
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        System.out.println(integers.stream().reduce((x,y)->x+y).get());

        // Ex.4 Counting occurences of a character
        String sentence="Hello World";
        System.out.println(sentence.chars().filter(x->x=='l').count());



    }
}
