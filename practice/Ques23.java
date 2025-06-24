import java.util.*;

public class Ques23 {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int max = Math.max(list1.size(), list2.size());
        for (int i = 0; i < max; i++) {
            if (i < list1.size()) result.add(list1.get(i));
            if (i < list2.size()) result.add(list2.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in first list: ");
        int n1 = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter " + n1 + " integers for first list:");
        for (int i = 0; i < n1; i++) {
            list1.add(scanner.nextInt());
        }

        System.out.print("Enter number of elements in second list: ");
        int n2 = scanner.nextInt();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter " + n2 + " integers for second list:");
        for (int i = 0; i < n2; i++) {
            list2.add(scanner.nextInt());
        }

        List<Integer> combined = alternate(list1, list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Alternate merged list: " + combined);
        scanner.close();
    }
}
