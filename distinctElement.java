import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class distinctElement {
    public static void main(String[] args) {
        List<Integer> elementsss=List.of(789,58,47,625,95,344,85,2,586,47,95,789,456,4250);
        List<Integer> ares = elementsss.stream().distinct().collect(Collectors.toList());
        System.out.println(ares);
    }
}
