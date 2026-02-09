package JAVA8_STREAMS;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface MathOperation{
    int operate(int a ,int b);
}

public class Streams {
    public static void main(String[] args) {

        MathOperation SumOp = (a,b)->a+b;
        MathOperation SubOp = (a,b)->a-b;
        MathOperation MulOp = (a,b)->a*b;
        MathOperation DivOp = (a,b)->a/b;
        System.out.println(SumOp.operate(20,10));
        System.out.println(SubOp.operate(20,10));
        System.out.println(MulOp.operate(20,10));
        System.out.println(DivOp.operate(20,10));

        // Predicate - Boolean Value Returns true or false

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(20));

        Predicate<String> isWordStartingwithA = x->x.startsWith("A");
        Predicate<String> isWordEndWithB = x->x.endsWith("A");
        Predicate<String> and = isWordStartingwithA.and(isWordEndWithB);
        System.out.println(and.test("ANKITHAS"));

        // Function - Work For You
        Function<Integer,Integer> doubleIt = x ->  x *2;
        Function<Integer,Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.andThen(tripleIt).apply(10));
        System.out.println(doubleIt.compose(tripleIt).apply(20));

        // Consumer - Takes input and returns nothing

        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello Java Stream");

        List<Integer> list = List.of(1,2,3);
        list.forEach(n-> System.out.println(n+" "));

        //Supplier - takes no input and returns a value

        Supplier<Integer> random = ()->(int)(Math.random()*100);
        System.out.println(random.get());
    }
}
