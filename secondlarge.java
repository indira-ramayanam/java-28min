import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;

public class secondlarge {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 3, 2, 1, 3, 44, 22, 43, 12, 35, 75, 235, 53, 24, 78, 54);
        //System.out.println(number);
        int large = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(large);
    }
}
