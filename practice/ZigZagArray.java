import java.util.Scanner;

public class ZigZagArray {
    public static void zigzagConvert(int[] arr, int n) {
        boolean flag = true; 

        for (int i = 0; i < n - 1; i++) {
            if (flag) { 
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else { 
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            flag = !flag; // Flip the flag for next comparison
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        zigzagConvert(arr, n);
        System.out.println("Zigzag array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
