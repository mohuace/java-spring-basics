package com.mohit.tutorials.java_spring_basics.sets;

import java.util.Set;

public class EgLinkedHashSet {
    public static void main(String[] args) {

        //Maintains insertion order
        //Linked List + Hash table
        //O(1) for add, remove, contains
        Set<Integer> linkedSet = new java.util.LinkedHashSet<>();

        linkedSet.add(55);
        linkedSet.add(33);
        linkedSet.add(44);
        linkedSet.add(35);
        linkedSet.add(23);

        System.out.println(linkedSet);

        //Use Case:
        //Looking for recent search history, order is important
        //Processing api requests in order, duplicate api requests wont be processed
    }
}
