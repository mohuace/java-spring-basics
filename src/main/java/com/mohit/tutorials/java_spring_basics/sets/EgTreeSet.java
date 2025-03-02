package com.mohit.tutorials.java_spring_basics.sets;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EgTreeSet {
    public static void main(String[] args) {
        //TreeSet implements NavigableSet and SortedSet
        //SortedSet maintains natural ordering (comparable)
        //but can have custom ordering too (comparator)
        //NavigableSet gives extra methods like ceiling, floor, higher, lower
        //TreeSet maintains a self balanced BST (Red Black Tree)
        //O(logn) for add, remove and contains
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(44);
        treeSet.add(32);
        treeSet.add(156);
        treeSet.add(96);

        //Natural ordering is ascending order
        System.out.println(treeSet);

        //Can give own custom comparator too
        TreeSet<Integer> treeSetDesc = new TreeSet<>(Comparator.reverseOrder());
        treeSetDesc.add(5);
        treeSetDesc.add(2);
        treeSetDesc.add(44);
        treeSetDesc.add(32);
        treeSetDesc.add(156);
        treeSetDesc.add(96);

        System.out.println(treeSetDesc);

        System.out.println(treeSet.ceiling(25)); //Ceiling returns lowest value >= e
        System.out.println(treeSet.floor(40)); //Floor returns greatest value <= e
        System.out.println(treeSet.lower(32)); //Returns lower value strictly < e
        System.out.println(treeSet.higher(44)); //Returns higher value strictly > e

        //Use Case:
        //You have a list of available rooms
        TreeSet<Integer> availableRooms = new TreeSet<>();
        availableRooms.add(105);
        availableRooms.add(103);
        availableRooms.add(102);
        availableRooms.add(101);

        //Now lets say you want the next available room after 102
        System.out.println(availableRooms.higher(102));

        //Alternative: You can have a list of unique elements and then sort them out
        //Then to get the next element after 102, you will have to loop through till 102 and then
        //Find the next element. This is a O(n) operation.
        //That is why, using TreeSet is better because it is a O(log n) operation
    }
}
