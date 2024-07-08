import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


public class streamSqr {
    public static void main(String[] args) {
        List<Integer> lrs = List.of(1,2,3,4,5,6,7,8);
       int r= lrs.stream().map(x->x*x).reduce(0,streamSqr::sum);
       int oddNumber =lrs.stream().filter(x->x%2!=0).reduce(0,streamSqr::sum);
       System.out.println(oddNumber);
       System.out.println(r);
       List<String> str =List.of("hello","world","java");
        str.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        List<Integer> lser = lrs.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
        List<Integer> lser1 = str.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lser1);
        System.out.println(lser);
    }
    private static int sum(int a, int b){
        return a+b;
    }
    private static int srq(int a, int b){
        return a*b;
    }
}
