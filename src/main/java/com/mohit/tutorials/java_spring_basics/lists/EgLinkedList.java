package com.mohit.tutorials.java_spring_basics.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EgLinkedList {

    public static void main(String[] args) {

        //Insertion and Deletion at beginning or end is Faster O(1)
        //Middle is still bad O(n)
        //But insertion or deletion in middle just requires the reference to be changed
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(13);

        System.out.println(linkedList);

        linkedList.set(1, 2000);

        System.out.println(linkedList);


    }
}
