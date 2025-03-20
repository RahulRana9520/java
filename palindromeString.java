import java.util.Scanner;

public class MakePalindromeSimple {
    public static String makePalindrome(String str) {
        int length = str.length();
        
        // Check from the end, removing characters until a palindrome is found
        for (int i = 0; i < length; i++) {
            if (isPalindrome(str, 0, length - i - 1)) {
                // Append missing characters in reverse
                String extra = "";
                for (int j = length - i - 1; j >= 0; j--) {
                    extra += str.charAt(j);
                }
                return str + extra;
            }
        }
        return str; // Already a palindrome
    }

    // Function to check if a substring is a palindrome
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String palindrome = makePalindrome(input);
        System.out.println("Palindrome version: " + palindrome);
    }
}