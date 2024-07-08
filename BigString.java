interface LargeString {
    String BString(String S);
}

public class BigString {
    public static void main(String[] args) {
        LargeString lr = (str) -> {
            int length = 0;
            str = "hello world welcome to java";
            String[] s = str.split(" ");
            for (String a : s) {
                System.out.println(a);
            }
            return str;
        };


        System.out.println(lr.BString("hello world welcome"));
    }
}
