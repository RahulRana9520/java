
public class JaggedArray {
    public static void main(String[] args) {
        // Declare a 2D jagged array with 3 rows
        int[][] jagged = new int[3][]; 
        
        // Define different column sizes for each row
        jagged[0] = new int[2];  // Row 0 has 2 columns
        jagged[1] = new int[4];  // Row 1 has 4 columns
        jagged[2] = new int[3];  // Row 2 has 3 columns
        
        // Initialize the jagged array
        int num = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = num++;
            }
        }

        // Print the jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println(); // Move to next line
        }
    }
}
