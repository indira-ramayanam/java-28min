import java.util.List;
import java.lang.Iterable;
public class Functional {
    public static void main(String[] args) {
        List<String> list = List.of("java", "Program", "language");
        List<Integer> listInt =List.of(1,2,3,4,5,6);
        FuncOne(list);
        FuncOne(listInt);
        EvenOdd(listInt);
        List<String> lis= List.of("cat","bat","dog");
        /*for(String s :lis)
        {
            if(s.endsWith("at"))
            {
                System.out.println(s);
            }
        }*/
    }
    public static void PrintwithAt(List<String> lis)
    {
        lis.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element-> System.out.println(element));

    }

    private static void FuncOne(List list) {
        list.stream().forEach(element -> System.out.println(element));
    }
    public static void EvenOdd(List<Integer> lis)
    {
        lis.stream()
                .filter(element ->element%2!=0)
                .forEach(element ->System.out.println(element));
    }

}
