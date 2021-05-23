package com.company.MapLernnig;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetArray {

    public void LinkedHashSet() {
        Set<Integer> numbersl = new LinkedHashSet<Integer>();
        numbersl.add(100);
        numbersl.add(14);
        numbersl.add(8);
        numbersl.add(99);
        numbersl.add(88);
        System.out.println(numbersl);
    }

    public void TreeSet() {
        Set<Integer> numbersl = new TreeSet<Integer>();
        numbersl.add(100);
        numbersl.add(14);
        numbersl.add(8);
        numbersl.add(99);
        numbersl.add(88);
        System.out.println(numbersl);
    }
}
