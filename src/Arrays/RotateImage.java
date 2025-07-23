package Arrays;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        //Leetcode 48
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        sol(matrix);

        System.out.println("\nRotated Matrix (90° Clockwise):");
        printMatrix(matrix);
    }
    static void sol(int[][] matrix){
        int n = matrix.length;
        // Step 1: Transpose the matrix (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n-1;
            while (start < end){
                // Swap matrix[i][start] and matrix[i][end]
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
