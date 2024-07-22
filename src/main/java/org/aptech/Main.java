package org.aptech;


public class Main {
    public static void main(String[] args) {
//        System.out.print("Hello world");
//        Computation comp = new Computation();
//        System.out.println( "k = " +comp.findK(6));
//        comp.divideTwo(6,3);
//        var input = new Scanner(System.in);
//        System.out.println("Enter the first mass: ");
//        double m1 = input.nextDouble();
//        System.out.println("Enter the second mass: ");
//        double m2 = input.nextDouble();
//        System.out.println("Enter the radius: ");
//        double r = input.nextDouble();
//
//        comp.gravityTS(r,m1,m2);
//        for (int num : numbers){
//        }
//        System.out.println(ArrayDemo.sumPassTen(numbers));
//        System.out.println(ArrayDemo.minValue(numbers));
//        System.out.println(ArrayDemo.arrItem(numbers));

//        int[] data = {1,2,3,4,5,6,7};
//        System.out.println(MultidimensionalArrays.reverseArr(data));

        // ******************** Triangle shii ************************

        int rows = 5;


        char[][] triangle = new char[rows][2 * rows - 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                triangle[i][j] = ' ';
            }
        }

        for (int i = 0; i < rows; i++) {
            int start = rows - 1 - i;
            int end = rows - 1 + i;
            for (int j = start; j <= end; j++) {
                triangle[i][j] = '*';
            }
        }

        printTriangle(triangle);
    }

    public static void printTriangle(char[][] triangle) {
        for (char[] row : triangle) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //Results****************************
//        MultidimensionalArrays.printResult();




// ****************************** Matrices ************************************

//        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
//
//        int[][] B = {{4, 8, 7},{6, 1, 3},{3, 2, 2}};
//        int[][] result = new int[A.length][A[0].length];
//
//        System.out.println("Addition: ");
//        MultidimensionalArrays.multiplyMatrix(A,B,result);
//        printMatrix(result);

    }


//    public static void printMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//    }

//****************Matrix end************************

