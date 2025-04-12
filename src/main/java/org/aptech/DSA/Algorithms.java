package org.aptech.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = {34,14,4,6,0};
        List<String> fruit = new ArrayList<>();
//        System.out.println(Arrays.toString(listIntersection(numbers, numbers2)));

    }

    public static int[] twoSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    return new int[]  {i, j};
                }
            }
        }
        return new int[] {};
    }
    public static int indexProduct(int [] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        return numbers[len - 1] * numbers[len - 2];
    }

//    public static int listIntersection(List<Integer> list1, List<Integer> list2){
//        List result;
//        for (int i = 0; i < list1.size(); i++){
//           if(list1.contains(list2.get(i))){
//
//           }

//        }


//
//    }
}
