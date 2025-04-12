package org.aptech.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 45, 8, 54, 33, 25, 9, 12, 5};

        insertionMethod(arr);
        for(int i:arr){
            System.out.print(i + ", ");
        }
    }

    public static int[] insertionMethod(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++){
            int temp = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
