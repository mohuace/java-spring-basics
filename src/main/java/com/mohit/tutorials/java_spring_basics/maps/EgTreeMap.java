package com.mohit.tutorials.java_spring_basics.maps;

import java.util.TreeMap;

public class EgTreeMap {
    public static void main(String[] args) {

        //Uses a BST internally
        //Has natural sorted ordering of keys or custom (comparator)
        TreeMap<Integer, String> mp = new TreeMap<>();

        mp.put(3, "mohit");
        mp.put(32, "jay");
        mp.put(29, "jay");
        mp.put(1, "gaurav");

        System.out.println(mp);


    }
}
