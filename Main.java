import java.io.*;
import java.util.Scanner;
//java.lang.Throwable;

public class Main {
    public static void main(String[] args){
                try {
                    int a = 10 / 0;
                    String s ="";
                    //System.out.println(a);
                    System.out.print(s.length());
                }
                /* catch (ArithmeticException ex)
                {
                     ex.printStackTrace();\\gives details about the error
                }
                catch(Exception e)
                {
                    e.printStackTrace();//
                    //System.out.println(e.toString());
                }*/
                catch(ArithmeticException |NullPointerException e)
                {
                 System.out.println(e.getMessage());
                }
    //System.out.println(a);


    }
}