public class lambdaEmpty {
    public static void main(String[]args)
    {
        stringEmpty str =(s)->{
            if (s.isEmpty())
            {
                return 0;
            }
            else{
                return 1;
            }

        };
        System.out.println(str.EmptyString(""));
        System.out.println(str.EmptyString("hello"));
    }

}
interface stringEmpty
{
    public int EmptyString(String S);
}
