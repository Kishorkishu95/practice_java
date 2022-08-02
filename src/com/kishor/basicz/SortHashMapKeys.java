package com.kishor.basicz;

import java.util.*;

public class SortHashMapKeys {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Kishor",522);
        map.put("Anusha",412);
        map.put("Sandy",502);
        map.put("Appi",516);
        System.out.println("Map : "+map);
        Map<String,Integer> mapTree=new TreeMap<>();
        // 1st way - Using putAll() method
        System.out.println("1st way - Using putAll() method");
        mapTree.putAll(map);
        System.out.println("After sorting a map : "+mapTree);
        // 2nd way - Using TreeMap() constructor
        System.out.println("2nd way - Using TreeMap() constructor");
        TreeMap<String,Integer> treeMap=new TreeMap<>(map);
        treeMap.forEach((name,marks)->{
            System.out.println("Name : "+name+", "+"Marks : "+marks);
        });
        // 3rd way - Using ArrayList and Collections.sort() method
        System.out.println("3rd way - Using ArrayList and Collections.sort() method");
        List<String> list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        list.forEach(k->{
            System.out.println("Name : "+k+", "+"Marks : "+map.get(k));
        });


    }
}
