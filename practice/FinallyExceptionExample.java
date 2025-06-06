public class FinallyExceptionExample {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println("Data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
