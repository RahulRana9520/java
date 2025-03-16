import java.util.Scanner;

public class ReplaceZeroWithOne {
    public static int replaceZeroWithOne(int num) {
        if (num == 0)  // if input is 0, return 1
            return 1;

        int result = 0, place = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0)
                digit = 1;
            result = (digit * place) + result;
            place *= 10;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int modifiedNum = replaceZeroWithOne(num);
        System.out.println("Output: " + modifiedNum);

        scanner.close();
    }
}
