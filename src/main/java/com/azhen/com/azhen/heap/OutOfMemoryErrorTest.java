package com.azhen.com.azhen.heap;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorTest {
    public static void main(String[] args) {
        List<Byte[]> list = new ArrayList<>();
        int i = 1;
        while (true) {
            Byte[] bytes = new Byte[i];
            i *= 2;
            list.add(bytes);
            System.out.println(list.size());
        }
    }
}
