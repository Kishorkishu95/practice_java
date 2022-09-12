package com.kishor.basicz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamS {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Ashwath","Babu","Chandan");
        List<String> list2= Arrays.asList("Ashwath","Sandy","Kishor");
        List<String> diff=list1.stream().filter(elem->!list2.contains(elem)).collect(Collectors.toList());
        System.out.println("Unique : "+diff);
    }
}
