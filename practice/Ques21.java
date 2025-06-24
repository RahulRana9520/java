import java.util.*;

public class Ques21 {
    public static void removeEvenLength(ArrayList<String> list) {
        list.removeIf(s -> s.length() % 2 == 0);
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
        removeEvenLength(list);
        System.out.println("List after removing even-length strings: " + list);
        scanner.close();
    }
}
