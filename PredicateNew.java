import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNew {
    public static void main(String[] args) {
        List<Integer> Numbers =List.of(1,9,5,3,5,22,34,64,72,12);
        Predicate<Integer> predicate = i -> i % 2 == 0;
        extracted1(Numbers, predicate);
        Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        extracted(Numbers, integerPredicate);
    }

    private static void extracted1(List<Integer> Numbers, Predicate<Integer> predicate) {
        Numbers.stream().filter(predicate).forEach(System.out::println);
    }

    private static void extracted(List<Integer> Numbers, Predicate<Integer> integerPredicate) {
        Numbers.stream().filter(integerPredicate).forEach(System.out::println);
    }
}
