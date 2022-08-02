package com.kishor.basicz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TraverseWaysHashMap {
    public static void main(String[] args) {
        Map<Integer,String> hashmap=new HashMap<>();
        hashmap.put(1,"kishor");
        hashmap.put(2,"sandy");
        hashmap.put(3,"Anusha");
        System.out.println("1st way - Using entrySet()");
        for(Map.Entry<Integer,String> m : hashmap.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue());
        }
        System.out.println("2nd way - Using forEach()");
        hashmap.forEach((id,name)->{
            System.out.println(id+" - "+name);
        });
        System.out.println("3rd way - Using stream()");
        hashmap.entrySet().stream().forEach(s->{
            System.out.println(s.getKey()+" - "+s.getValue());
        });
    }
}
