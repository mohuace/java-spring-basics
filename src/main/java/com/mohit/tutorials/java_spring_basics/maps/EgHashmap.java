package com.mohit.tutorials.java_spring_basics.maps;

import java.util.HashMap;
import java.util.Map;

public class EgHashmap {
    public static void main(String[] args) {
        //Hashmap does not have any ordering
        //Stores key value pairs, keys are unique

        Map<Integer, String> mp = new HashMap<>();

        //Behind the scene, Java will create a hashcode for all keys and store the element in a particular
        //bucket. Then when retrieving, it will again use the hashCode function to generate the hashcode and
        //then go the bucket to retrieve the element
        mp.put(3, "Mohit");
        mp.put(4, "Jay");
        mp.put(1, "Gaurav");
        mp.put(56, "John");
        mp.put(42, "Tom");
        mp.put(33, "Siddharth");

        System.out.println(mp);

        System.out.println(mp.get(1));
    }
}
