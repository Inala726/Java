package org.aptech.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        history.push("abc.com");
        history.push("bbcnews.com");
        history.push("manu.com");
        history.push("");
//        System.out.println(history);
        String peekItem = history.peek();
        System.out.println(peekItem);
    }
}
