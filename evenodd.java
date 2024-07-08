import java.util.List;

public class evenodd {
    public static void main(String[] args) {
        List<Integer> number =List.of(1,2,3,2,1,3,44,22,43,12,35,75,235,53,24,78,54);
        System.out.println(number);
        int even_add =number.stream().filter(i->i%2==0).reduce(0,Integer::sum);
        int odd_add =number.stream().filter(i->i%2!=0).reduce(0,Integer::sum);


        System.out.println(even_add);
        System.out.println(odd_add);
    }
}
