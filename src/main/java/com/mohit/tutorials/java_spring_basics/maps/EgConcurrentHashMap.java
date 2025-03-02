package com.mohit.tutorials.java_spring_basics.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EgConcurrentHashMap {
    public static void main(String[] args) {
        //Other types of Maps are not Thread Safe
        //ConcurrentHashMap is thread safe, allows for multiple threads to read and write
        //TODO: Create multiple threads and perform some operations to demonstrate it is
        //thread safe
        Map<Integer, String> mp = new ConcurrentHashMap<>();

        mp.put(3, "Mohit");
        mp.put(4, "Jay");
        mp.put(1, "Gaurav");
        mp.put(56, "John");
        mp.put(42, "Tom");
        mp.put(33, "Siddharth");

        System.out.println(mp);
    }
}
