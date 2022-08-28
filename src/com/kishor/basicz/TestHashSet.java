package com.kishor.basicz;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(null);
        set.add(null);
        set.add(25);
        set.add(25);
        System.out.println(set);
    }
}
