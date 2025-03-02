package com.mohit.tutorials.java_spring_basics.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class EgWeakHashMap {
    public static void main(String[] args) throws InterruptedException {

        //In Weakhashmaps, the hashmap stores weak references to the keys,
        //that is it will remove entries of keys that are no longer referenced
        String key1 = new String("m");
        String key2 = new String("k");

        //String pool concept
        String key3 = "s";

        Map<Object, String> weak = new WeakHashMap<>();
        Map<Object, String> mp = new HashMap<>();

        weak.put(key1, "some value");
        weak.put(key3, "string pool value");
        mp.put(key2, "some value");

        System.out.println("The Weak hashmap is "+weak);
        System.out.println("The strong hashmap is "+mp);

        //Removing references of keys
        key1 = null;
        key2 = null;
        key3 = null;

        //Calling garbage collector to remove from heap memory
        System.gc();

        //Waiting a little for system to garbage collect
        Thread.sleep(1000);

        System.out.println("The Weak hashmap is "+weak);
        System.out.println("The strong hashmap is "+mp);

        //The reason why key3 is not removed in gc is because
        //String literals are stored in String pool by Java and can be reused
        //later. That is, String key3 = "s"; will be stored in string pool that will
        //hold a strong reference to "s" that wont be removed from gc
        //key3 = null will remove the reference of key3 with "s", but string pool still
        //hold a strong reference to "s" and hence wont be garbage collected, therefore,
        //WeakHashmap wont remove it because it is still strongly referenced


    }
}
