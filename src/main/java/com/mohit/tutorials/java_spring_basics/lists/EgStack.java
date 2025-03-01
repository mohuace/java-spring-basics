package com.mohit.tutorials.java_spring_basics.lists;

import java.util.Stack;

public class EgStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
