import java.util.List;

public class stringtoupper {
    public static void main(String[] args) {
        List<String> lowercaseString= List.of("apple","banana","cats","dog","eggs","fun");
        lowercaseString.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
