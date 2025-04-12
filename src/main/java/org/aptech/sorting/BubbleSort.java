package org.aptech.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {23, 12, 45, 8, 54, 33, 25, 9, 12, 5};

        bubbleSortMethod(arr);

        System.out.println("Sorted Array:");
        for(int i: arr){
            System.out.print(i + ", ");
        }
    }

    public static void bubbleSortMethod(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
