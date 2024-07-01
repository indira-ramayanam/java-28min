import java.util.ArrayList;
import java.util.List;

public class FilesDemo {
    public static void main(String[]args)
    {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);//add element
        list.add(3);
        list.add(3,4);//adding at a particluar element
        System.out.println(list);
        //list.remove(0);//to remove from a particular element
        System.out.println(list.get( 3));// to return the element from a particular index.
        list.set(1,0);
        System.out.println(list.indexOf(4));
        System.out.println(list.lastIndexOf(4));//returns the occurance of a particular element's index or return -1 if element not found;
        System.out.println(list.contains(1));//returns boolean value if the element is present in the list
        System.out.println(list.isEmpty());//return boolean value
        System.out.println(list.size());


    }
}
