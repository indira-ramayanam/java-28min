public class SimpleOddNumberException {
    public static void main(String[] args) {
        try {
            int number = generateNumber();
            System.out.println("Generated number: " + number);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int generateNumber() throws Exception {
        int number = 123;
        if (number % 2 != 0) {
            throw new Exception("Generated odd number: " + number);
        }
        return number;
    }
}
