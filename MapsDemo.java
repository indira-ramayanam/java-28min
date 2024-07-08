//Map are used to iterate a collection they are implemented by interface and not class bcs for abstraction and flexibility reasons map consists of key value
//pairs key must be unique and notnull while values can have same value;the main reason for implementing map is to reduce number of iterations which are performed on loops .
import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
public static void main(String[]args){
    Map<Integer,String> m1 =new HashMap<>();
    m1.put(1,"indira");
    m1.put(2,"Ramayanam");
    m1.put(3,"venkata");
    System.out.println(m1);
    System.out.println(m1.keySet());
    System.out.println(m1.values());
    System.out.println(m1.get(2));
    m1.put(3,"rr");
    m1.putIfAbsent(3,"rr");
   System.out.println( m1.containsValue("rr"));
   System.out.println(m1.containsKey(1));
   System.out.println(m1.size());
   m1.remove(1);
    System.out.println(m1);
}
}
