package com.mohit.tutorials.java_spring_basics.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class EgVectorList {
    public static void main(String[] args) {
        //Vector is a synchronized thread safe array list
        //Slower than array list
        List<String> vector = new Vector<>();

        vector.add("a");
        vector.add("b");
        vector.add("c");

        System.out.println(vector);

        //Alternative (probably better)
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        //Or CopyOnWriteArrayList as well works (creates new copy and updates the ref)
    }
}
