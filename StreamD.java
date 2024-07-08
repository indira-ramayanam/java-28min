import java.util.List;

public class StreamD {
        public static void main(String[] args) {
            List<Integer> liss = List.of(11111, 2, 1, 2, 3, 23, 5);
            int addr = addr(liss);
            System.out.println(addr);

        }

    private static int Sum(int a, int b) {
        return a + b;
    }

    private static int addr(List<Integer> ls) {
        //ls.stream();
        return    ls.stream().reduce(0, StreamD::Sum);
    }
}