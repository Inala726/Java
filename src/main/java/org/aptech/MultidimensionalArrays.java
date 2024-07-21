package org.aptech;

public  class MultidimensionalArrays {

    public static void addMatrix(int[][] A, int[][] B, int[][] result) {
        int rows = A.length;
        int cols = A[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    public static void subtractMatrix(int[][] A, int[][] B, int[][] result) {
        int rows = A.length;
        int cols = A[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
    }

    public static void multiplyMatrix(int[][] A, int[][] B, int[][] result) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;  // Initialize the element to 0
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];  // Perform multiplication and sum up
                }
            }
        }
    }
}
