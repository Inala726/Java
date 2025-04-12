package org.aptech.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> studentSet = new HashSet<>();
        studentSet.add("Mike");
        studentSet.add("Daniel");
        studentSet.add("King");
        studentSet.add("Precious");

        studentSet.forEach(System.out::println);
    }
}
