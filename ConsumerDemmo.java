import java.sql.SQLOutput;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemmo {
    public static  void main(String[] args) {
        List<Integer> ls =List.of(01,12,3,42,4,24,6,46,78,9);
        Consumer<Integer> doubleValue = n-> System.out.println(n*2);
        List<String> str = List.of("hello","java","world");
        extracted(str);
        ls.forEach(doubleValue);

    }

    private static void extracted(List<String> str) {
        str.stream().map(s->s.toUpperCase()).forEach(System.out::println);
    }

    static String upperCase(String s)
    {
        return s.toUpperCase();
    }
}
