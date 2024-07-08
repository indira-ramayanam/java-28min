import java.util.List;
import java.util.stream.Collectors;

public class ElementinString {
    public static void main(String[] args) {
        List<String> elements =List.of("hello","java","Indira","ramayanam","venkata","indira ramayanam","venkata indira Ramayanam");
       List<String>  ele= elements.stream().filter(s->s.contains("indira")).collect(Collectors.toList());
        System.out.println(ele);
    }
}
