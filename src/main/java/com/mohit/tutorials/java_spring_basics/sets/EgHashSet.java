package com.mohit.tutorials.java_spring_basics.sets;

import java.util.HashSet;
import java.util.Set;

public class EgHashSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        //No ordering maintained
        //Fastest, O(1) for insertion, deletion and contains
        set.add(15);
        set.add(3);
        set.add(42);
        set.add(8);
        set.add(20); //Doesnt allow duplicates

        System.out.println(set);

        //Use Case:
        //Storing unique ids of employees in a system
        //Here, you dont want duplicates, and ordering doesn't matter
    }

}
