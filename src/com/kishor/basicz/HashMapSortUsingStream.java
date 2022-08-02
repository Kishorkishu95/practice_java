package com.kishor.basicz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortUsingStream {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        map.put("Kishor", 522);
        map.put("Anusha", 412);
        map.put("Sandy", 502);
        map.put("Appi", 516);
        sortByKeys();
    }

    public static void sortByKeys() {
        HashMap<String, Integer> temp = map.entrySet()
                .stream()
                .sorted((i1, i2) -> i1.getKey().compareTo(i2.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}
