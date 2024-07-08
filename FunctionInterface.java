import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterface {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,5);
        BiFunction<Integer,Integer,Integer> func =(a, b)->a+b;
        System.out.println(func.apply(12,13));
        List<Integer> srd = arr.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(srd);
       int sum= arr.stream().reduce(0,FunctionInterface::Sum);
       int multiply = getReduce(arr);
        System.out.println(multiply);}

    private static Integer getReduce(List<Integer> arr) {
        return arr.stream().reduce(1, (x, y) -> x * y);
    }

    static int Sum(int a ,int b)
    {
        return a+b;
    }
}
