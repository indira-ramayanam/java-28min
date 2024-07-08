import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapingFunction {
    public static void main(String[] args) {
        List<Integer> listDemo =List.of(1,2,3,4,5,6,7,8,19,3,33,18,15);
        Predicate<Integer> arp = getIntegerPredicate();
        BinaryOperator<Integer> div = (x,y)->x%y;
        System.out.println(div.apply(2,3));
        int ares =listDemo.stream().filter(i->i>4).reduce(1,div);
        System.out.println(ares);
        List<Integer> arps =listDemo.stream().filter(getIntegerPredicate()).collect(Collectors.toList());
        System.out.println(arps);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        Predicate<Integer> arp = i->i%3==0;
        return arp;
    }
}
