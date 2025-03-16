import java.util.Scanner;

public class ReArrangeArray {
    public static void rearrange(int[] arr, int n) {
        int j = 0; // Pointer to track the position of the first positive number

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) { // If a negative number is found
                // Swap the negative number with the first positive number found so far
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++; // Move pointer to track next positive number
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        rearrange(arr, n);

        System.out.println("Rearranged array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

