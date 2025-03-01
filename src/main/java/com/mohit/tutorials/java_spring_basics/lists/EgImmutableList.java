package com.mohit.tutorials.java_spring_basics.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EgImmutableList {

    public static void main(String[] args) {
        List<String> immutableList = Collections.unmodifiableList(Arrays.asList("A", "b", "C"));
        //Throws UnsupportedOperationException because it is an immutable list
        immutableList.add("X");
    }




}
