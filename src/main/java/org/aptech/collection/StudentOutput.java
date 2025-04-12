package org.aptech.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentOutput {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        students.put(1, new Student(101, "Daniel Ingwer", 3.5));
        students.put(2, new Student(102, "Jacob King", 3.9));
        students.put(3, new Student(103, "Kore Como", 2.5));
        students.put(4, new Student(104, "Peter Obi", 2.9));

        for (Map.Entry<Integer, Student> stud : students.entrySet()){
            System.out.println(stud.toString());
        }
    }


}
