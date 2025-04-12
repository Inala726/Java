package org.aptech.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 1);
        fruits.put("Banana", 2);
        fruits.put("Cherry", 3);
        fruits.put("Dates", 4);

//         fruits.clear();
        String key = "Watermelon";
        if (fruits.containsKey(key)){
            System.out.println();
        }
//
//        for (Map.Entry<String, Integer> fruit: fruits.entrySet()){
//            System.out.print(fruit.getKey() + ":");
//            System.out.println(fruit.getValue());
//        }
        System.out.println(fruits);

        Map<String, String> myCars = new LinkedHashMap<>();
        myCars.put("Audi", "Green");
        myCars.put("BMW", "Purple");
        myCars.put("Chevrolet", "Yellow");
        myCars.put("", "");


    }


}
