import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class stringsort {
    public static void main(String[] args) {
        List<String> elements =List.of("hello","java","Indira","ramayanam","venkata");
        elements.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        elements.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
        elements.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
