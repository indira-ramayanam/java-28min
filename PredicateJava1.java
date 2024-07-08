//predicate are functional interface which are used to return a boolean value and contains a method called test();
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

//import static jdk.internal.org.jline.utils.Colors.s;

public class PredicateJava1 {
public static void main(String[] args) {
    Predicate<Integer> pr;
    pr = PredicateJava1::Age;
    System.out.println(pr.test(12));
    Predicate<Integer> pk =x->(x>18);
    Predicate<Integer> pv =x->(x<50);
    System.out.println(pk.and(pv).test(16));//both the conditions must be true
    System.out.println(pk.or(pv).test(15));//one condition must be true
    System.out.println(pk.negate().test(13));// return the neg value
    Predicate<String> str =x->x.contains("welcome");
    Predicate<String> sss =Predicate.isEqual("welcome");
    System.out.println(sss.test("welcome"));
    System.out.println(str.test("welcome"));
    Function<Integer,Integer> adder =a->a+a;
    System.out.println(adder.apply(2));
    Function<Integer,Integer> adds = (a)->a*12;
    System.out.println(adds.apply(12));
    Function<Integer,Integer> doublefunc = adder.andThen(adder);
    System.out.println(doublefunc.apply(3));
    BiFunction<Integer,Integer,Integer> TwoAdder=(a,b)->a+b;
    System.out.println(TwoAdder.apply(1,2));
}
 static boolean Age(int n)
{
    if(n>18)
    {
        return true;
    }
    else{
        return false;
    }
}}