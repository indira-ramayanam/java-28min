interface demo1{
    public void sum(int a, int b,String name);
    public void add(int i);
}
public class FuncLambda {
    public static void main(String[]args)
    {
        demo1 d1 =(a,b,name)->{
            System.out.println(a+b);
            System.out.println(name);

        };
        d1.sum(12,13,"addition");
    }
}
