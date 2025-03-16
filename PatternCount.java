import java.util.Scanner;

public class PatternCount {
    public static int countPatterns(String str) {
        int count = 0;
        int n = str.length();

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == '0') {
                int j = i + 1;
                while (j < n && str.charAt(j) == '1') {
                    j++;
                }
                if (j < n && str.charAt(j) == '0') {
                    count++;
                    i = j - 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String str = sc.next();
        
        int result = countPatterns(str);
        System.out.println("Total patterns found: " + result);
        
        sc.close();
    }
}
