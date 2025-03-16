import java.util.Scanner;

public class SaddlePointMatrix {
    public static void findSaddlePoint(int[][] matrix, int row, int column) {
        boolean found = false;
        for (int i = 0; i < row; i++) {
            int minRowIndex = 0;
            int minValue = matrix[i][0];
            for (int j = 1; j < column; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minRowIndex = j;
                }
            }
            boolean isSaddlePoint = true;
            for (int k = 0; k < row; k++) {
                if (matrix[k][minRowIndex] > minValue) {
                    isSaddlePoint = false;
                    break;
                }
            }
            if (isSaddlePoint) {
                System.out.println("Saddle Point found at (" + i + ", " + minRowIndex + ") with value: " + minValue);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Saddle Point found.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        findSaddlePoint(matrix, row, column);
        sc.close();
    }
}
