package com.mohit.tutorials.java_spring_basics.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EgLinkedHashMap {
    public static void main(String[] args) {

        //Same as HashMap, just maintains insertion ordering
        //Uses doubly linked list internally
        Map<Integer, String> mp = new LinkedHashMap<>();

        mp.put(3, "Mohit");
        mp.put(4, "Jay");
        mp.put(1, "Gaurav");
        mp.put(56, "John");
        mp.put(42, "Tom");
        mp.put(33, "Siddharth");

        System.out.println(mp);
    }
}
