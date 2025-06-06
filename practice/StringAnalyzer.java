import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int alphabets = 0, digits = 0, words = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch))
                alphabets++;
            else if (Character.isDigit(ch))
                digits++;
        }

        // Splitting by whitespace to count words
        String[] wordArray = input.trim().split("\\s+");
        words = (input.trim().isEmpty()) ? 0 : wordArray.length;

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Words: " + words);
    }
}
