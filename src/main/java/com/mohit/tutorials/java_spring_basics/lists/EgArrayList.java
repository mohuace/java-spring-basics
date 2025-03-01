package com.mohit.tutorials.java_spring_basics.lists;

import java.util.ArrayList;
import java.util.List;

public class EgArrayList {

    public static void main(String[] args) {

        //Insertion is usually slower in the middle
        //Fast access O(1)
        //Insertion / Deletion in middle requires shifting all indexes ahead of it (expensive)
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        System.out.println(arrayList);

        arrayList.set(2, 2000);

        System.out.println(arrayList);

        arrayList.remove(2);

        System.out.println(arrayList);

    }
}
