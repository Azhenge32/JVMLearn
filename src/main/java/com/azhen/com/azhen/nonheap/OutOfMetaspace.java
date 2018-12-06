package com.azhen.com.azhen.nonheap;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
 */
public class OutOfMetaspace {
    public static void main(String[] args) {
        List<Class<?>> classList = new ArrayList<>();
        while (true) {
            classList.addAll(Metaspace.createClasses());
        }
    }
}
