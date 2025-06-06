import java.io.*;

public class ExceptionExample {
    static void checkFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName); // Checked exception
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            checkFile("test.txt");
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e);
        }

        // Unchecked exception using throw
        int age = 15;
        if (age < 18)
            throw new ArithmeticException("Age must be 18+");
    }
}
