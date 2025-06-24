import java.util.ArrayList;
import java.util.Scanner;

public class Ques22 {
    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        System.out.println("Original list: " + list);
        swapPairs(list);
        System.out.println("List after swapping pairs: " + list);
        scanner.close();
    }
}
