import java.util.*;

class InvalidInputException extends Exception {
    String errMsg;

    public InvalidInputException(String msg) {
        errMsg = msg;
    }

    public String toString() {
        return errMsg;
    }
}

class MyCalculator {
    private int n, p;

    MyCalculator(int n, int p) {
        this.n = n;
        this.p = p;
    }

    public void power(int n, int p) {
        try {
            if (n < 0 || p < 0) {
                throw new InvalidInputException("Either n or p is negative");
            } else if (n == 0) {
                throw new InvalidInputException("n cannot be zero");
            } else {
                System.out.println("n raised to the power p: " + Math.pow(n, p));
            }
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}

public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter value of P: ");
        int p = sc.nextInt();
        MyCalculator myCal = new MyCalculator(n, p);
        myCal.power(n, p);
        sc.close();
    }
}
