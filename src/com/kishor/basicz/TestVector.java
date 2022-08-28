package com.kishor.basicz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(null);
        list.add(null);
        System.out.println(list);
        list.add(3);
        System.out.println(list);


    }


}
