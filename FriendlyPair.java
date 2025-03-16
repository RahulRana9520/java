import java.util.Scanner;

class FriendlyPair {
    static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if ((sum1 / (double) num1) == (sum2 / (double) num2)) {
            System.out.println(num1 + " and " + num2 + " are Friendly Pair.");
        } else {
            System.out.println(num1 + " and " + num2 + " are Not Friendly Pair.");
        }
        sc.close();
    }
}
