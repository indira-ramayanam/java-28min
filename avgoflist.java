import java.util.List;

public class avgoflist {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,5,4,7,9,12,100);
       int add = list.stream().reduce(0,Integer::sum);
        System.out.println(add);

    }


}
