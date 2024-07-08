import java.util.Comparator;
import java.util.List;

public class secondsmall {
    public static void main(String[] args) {
        List<Integer> elements=List.of(3,2,4,1,7,0,9,7,5,3,45);
        int second =elements.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(second);
    }
}
