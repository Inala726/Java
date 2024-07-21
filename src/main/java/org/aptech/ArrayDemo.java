package org.aptech;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static int sumArray(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum+=num;
        }
        return sum;
    }

    public static int sumArray2 (int[] numbers) {
       return Arrays.stream(numbers).sum();
    }

    public static int sumEven(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++ ){
            if (numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int sumPassTen(int[] numbers){
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            var number = numbers[i];
            if(number > 10){
                sum += number;
            }
        }
        return sum;
    }
    public static int minValue(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static String arrItem(int[] arr){
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    public static int listMenuIndex(int length){
        return length;
    }

    public static String listMenu(int[] arr){
        for (int i = 0; i < arr.length; i++) {

        }
        return Arrays.toString(arr);
    }





}
