package org.aptech.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(sumEven(numbers));
        System.out.println(findMax(numbers));
    }

    public static int findMax(List<Integer> numbers) {
        if(numbers.isEmpty())
            throw new RuntimeException("Please enter numbers into the list");
        String demo = numbers.toString();
        return Collections.max(numbers);
    }

    public static int sumEven(List<Integer> numbers){
        int sum = 0;
        for(int num : numbers){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }

//    public static int addIndex(List<Integer> numbers, int target) {
//        for(int num:numbers){
//            if (numbers.indexOf(num) + (numbers.indexOf(num)){
//
//            }
//        }
//    }

}
