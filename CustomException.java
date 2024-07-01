import java.io.IOException;
//custom error msg
public class CustomException {
    public static void main(String[]args) throws Exception
    {
        try{
            int a=10/0;

        } catch (Exception e) {
            throw new Exception("noo not possible");//passing msg
        }
        finally
        {
            System.out.println("done finally");

        }

    }
}
