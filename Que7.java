import java.util.Scanner;
public class Que7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row:");
        int row = sc.nextInt();
        System.out.print("Enter the column:");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("Enter the element of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int val = sc.nextInt();
                matrix[i][j]=val;
            }
        }
        // logic
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               if(matrix[i][j]>matrix[i++][j] && matrix[i][j]<matrix[i][j++]){
                    System.out.print(" " + matrix[i][j]);
                }
            }
        }
        
        // for(int i=0;i<row;i++){
        //     System.out.println(" ");
        //     for(int j=0;j<column;j++){
        //         System.out.print(" " + matrix[i][j]);
        //     }
        // }
        sc.close();
    }
}
// SAMPLE CASE
// 2 5 6 9
// 8 4 12 3
// 6 7 3 1 
// 12 24 2 11


//4 6 12 
// 2 8 14
// 1 3 6

//leetcode 1380