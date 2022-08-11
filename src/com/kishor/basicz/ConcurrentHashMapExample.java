package com.kishor.basicz;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // ConcurrentHashMap is a better choice when there are more reads than writes.
        Map<String,String> employee=new ConcurrentHashMap<>();
        employee.put("FirstName","Kishor");
        employee.put("LastName","B");
        employee.put("Age","27");
        employee.put("DOB","05/05/1995");
        employee.put("Professional","Software Engineer");
        employee.entrySet().stream().forEach((k)->{
            System.out.println(k.getKey()+" -> "+k.getValue());
        });
    }
}
