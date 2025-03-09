import java.util.Arrays;
import java.util.Scanner;

class ArrayDemo {

    // Function to find pairs whose sum is equal to the given target using Binary Search
    void findPairs(int arr[], int target) {
        Arrays.sort(arr); // Sort the array first
        int n = arr.length;
        System.out.println("Pairs of elements whose sum is " + target + " are:");

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i]; // Find the required pair value

            // Perform Binary Search manually
            int low = i + 1, high = n - 1, mid;
            while (low <= high) {
                mid = low + (high - low) / 2;

                if (arr[mid] == complement) {
                    System.out.println(arr[i] + " + " + arr[mid] + " = " + target);
                    break; // Found the pair
                } else if (arr[mid] < complement) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }

    // Function to merge two sorted arrays while maintaining sorted order
    void mergeArrays(int A[], int p, int B[], int q) {
        int[] merged = new int[p + q];
        int i = 0, j = 0, k = 0;

        while (i < p && j < q) {
            if (A[i] < B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }

        while (i < p) merged[k++] = A[i++];
        while (j < q) merged[k++] = B[j++];

        // Copy merged values back to A and B
        System.arraycopy(merged, 0, A, 0, p);
        System.arraycopy(merged, p, B, 0, q);

        System.out.println("Merged Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDemo obj = new ArrayDemo();

        // First method: Finding pairs whose sum equals target
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        obj.findPairs(numbers, target);

        // Second method: Merging two sorted arrays
        System.out.print("\nEnter the size of first sorted array (A): ");
        int p = scanner.nextInt();
        int[] A = new int[p];
        System.out.println("Enter " + p + " sorted elements for A:");
        for (int i = 0; i < p; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of second sorted array (B): ");
        int q = scanner.nextInt();
        int[] B = new int[q];
        System.out.println("Enter " + q + " sorted elements for B:");
        for (int i = 0; i < q; i++) {
            B[i] = scanner.nextInt();
        }

        obj.mergeArrays(A, p, B, q);

        scanner.close();
    }
}
