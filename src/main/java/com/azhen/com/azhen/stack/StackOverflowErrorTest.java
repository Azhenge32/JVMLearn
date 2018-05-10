package com.azhen.com.azhen.stack;

public class StackOverflowErrorTest {
    static int num = 1;
    public static void main(String[] args) {
        testStack();
    }

    public static void testStack() {
        System.out.println(num ++);
        testStack();
    }
}
