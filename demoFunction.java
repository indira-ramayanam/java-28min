import java.util.List;

public class demoFunction {
    public static void main(String[]args) {
        List<String> list = List.of("hello", "print", "world", "demo", "java");
        printElements(list);
    }
        public static void printElements(List<String> list)
        {
            for(String s :list)
            {
                System.out.println(s);
            }
        }


}
