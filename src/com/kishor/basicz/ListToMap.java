package com.kishor.basicz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            map.put(i, list.get(i));
        }
        System.out.println(map);
  
    }
}
