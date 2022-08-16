package com.kishor.basicz;

import java.util.*;

public class HashMapSortUsingLambdaExp {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Kishor",522);
        map.put("Anusha",412);
        map.put("Sandy",502);
        map.put("Appi",516);
        Map<String,Integer> sortedByNames=sortByKeys(map);
        for(Map.Entry<String,Integer> m : sortedByNames.entrySet()){
            System.out.println("Name : "+m.getKey()+", "+"Marks : "+m.getValue());
        }

    }

    private static Map<String, Integer> sortByKeys(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> listKeys=new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(listKeys,(i1,i2)->i1.getKey().compareTo(i2.getKey()));
        Map<String,Integer> mapped=new HashMap<>();
        for(Map.Entry<String,Integer> m : listKeys){
            mapped.put(m.getKey(),m.getValue());
        }
        return mapped;

    }
}
