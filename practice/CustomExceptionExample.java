// Custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(25);
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
