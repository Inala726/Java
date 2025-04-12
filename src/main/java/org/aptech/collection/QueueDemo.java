package org.aptech.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> orderList = new LinkedList<>();
        orderList.add("King");
        orderList.add("Prince");
        orderList.add("Daniel");
        orderList.add("Korede");
//        orderList.forEach(System.out::println);

        String peek = orderList.peek();
        System.out.println(peek);

        Queue<QueuePojo> chartList = new LinkedList<>();
        chartList.add(new QueuePojo(1, "Korede"));
        chartList.add(new QueuePojo(1, "Queue"));
        chartList.add(new QueuePojo(1, "Korede"));









    }
}
