import java.util.List;

public class LambdaEvenOdd{
    public static void main(String[]args)
    {
        List<Integer> list12 = List.of(1,2,3,4,5,6,7,8,9,10);
        EvenOdd e1= (n)->{
            if(n%2==0){
                return 0;
            }
            else{
                return 1;
            }

        };
       System.out.println(e1.evenOOdd(12));
       System.out.println(e1.evenOOdd(13));
    }
}
interface EvenOdd{
    public int evenOOdd(int n);
}