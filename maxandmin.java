import java.util.Comparator;
import java.util.List;

public class maxandmin {
    public static void main(String[] args) {
        List<Integer> elementsss=List.of(789,58,47,625,95,344,85,2,586,47,95,789,456,4250);
        int maxNumber=elementsss.stream().sorted(Comparator.naturalOrder()).findFirst().orElseThrow();
        int minNumber=elementsss.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow();
         System.out.println(maxNumber);
        System.out.println(minNumber);

    }
}
