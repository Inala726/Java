package org.aptech;

import java.util.Scanner;

public  class MultidimensionalArrays {
    static String comp = "Please enter students name: ";
    static Scanner scanner =  new Scanner(System.in);

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










    public static void printResult(){
        System.out.println(comp);
        String name = scanner.nextLine();
        System.out.println("Enter the first subject title");
        String firstSubject = scanner.nextLine();
        System.out.println("Enter the second subject title");
        String secSubject = scanner.nextLine();
        System.out.println("Enter the third subject title");
        String thirdSubject = scanner.nextLine();
        String[] subjects = {firstSubject, secSubject, thirdSubject};
        System.out.println("Enter the first subject's score");
        int firstScore = scanner.nextInt();
        System.out.println("Enter the second subject's score");
        int secondScore = scanner.nextInt();
        System.out.println("Enter the second subject's score");
        int thirdScore = scanner.nextInt();
        int[] scores = {firstScore, secondScore, thirdScore};

        System.out.println("Student's Grade");
        System.out.println(name + " {");
        System.out.println(subjects[0] + ":" + scores[0]);
        System.out.println(subjects[1] + ":" + scores[1]);
        System.out.println(subjects[2] + ":" + scores[2]);
        System.out.println("}");
    }

    public static void printTriangle(){
        for (int i = 1; i < 5; i++) {
            System.out.println(" ");
        }
    }
}
