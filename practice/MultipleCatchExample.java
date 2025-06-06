public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;  // This throws ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught!");
        }
        System.out.println("Rest of the code...");
    }
}
