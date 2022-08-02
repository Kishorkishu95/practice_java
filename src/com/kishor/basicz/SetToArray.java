package com.kishor.basicz;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {
    public static void main(String[] args) {
        Set<String> setVal=new HashSet<>();
        setVal.add("Kish");
        setVal.add("Kishor");
        setVal.add("kish");
        setVal.add("kish");
        System.out.println(setVal);
        String[] str=new String[setVal.size()];
        setVal.toArray(str);
        for (String s: str) {
            System.out.print(s+" ");
        }
    }


}
