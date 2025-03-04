package com.mohit.tutorials.java_spring_basics.comparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Mohit", "abc");
        Employee emp2 = new Employee(3, "Jay", "abc1");
        Employee emp3 = new Employee(4, "Gaurav", "abc2");
        Employee emp4 = new Employee(2, "Siddharth", "2abc");
        Employee emp5 = new Employee(6, "Rohan", "abc3");
        Employee emp6 = new Employee(7, "Sahil", "abc55");
        Employee emp7 = new Employee(5, "Omkar", "abc4443");

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);

        Collections.sort(empList);

        System.out.println(empList);

        Collections.sort(empList, Comparator.reverseOrder());

        System.out.println(empList);

        //This is the custom comparator, here I have compared two employees based on their names
        Comparator<Employee> empNameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(empList, empNameComparator);

        System.out.println(empList);

    }
}
