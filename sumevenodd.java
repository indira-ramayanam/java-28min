import java.util.List;

public class sumevenodd {
    public static void main(String[] args) {
        List<Integer> elementsss=List.of(789,58,47,625,95,344,85,2,586,47,95,789,456,4250);
        int sumEven =elementsss.stream().filter(i->i%2==0).reduce(0,Integer::sum);
        int sumodd =elementsss.stream().filter(i->i%2!=0).reduce(0,Integer::sum);
        System.out.println(sumEven);
        System.out.println(sumodd);
    }
}
