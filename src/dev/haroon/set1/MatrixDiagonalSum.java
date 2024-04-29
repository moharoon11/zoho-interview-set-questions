package dev.haroon.set1;

/**
 * 4. Matrix Diagonal sum
 *
 * Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
 *
 * I/P:
 *
 * 3 3
 *
 * 1 2 3
 *
 * 4 5 6
 *
 * 7 8 9
 *
 * O/P: 38
 */

// wrong solutions , solution kadal la ilayam
public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(findLargestDiagonalSum(matrix));
    }

    private static int findLargestDiagonalSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int sum1 = 0;
        int sum2 = 0;

        // Calculate sum of the first triangle
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                sum1 += matrix[i][j];
            }
        }

        // Calculate sum of the second triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - i - 1; j++) {
                sum2 += matrix[i][j];
            }
        }

        return Math.max(sum1, sum2);
    }
}
