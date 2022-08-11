package com.kishor.basicz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortInDesc {
    public static void main(String[] args) {
        Integer intArray[] = {5, 20, 22, 89, 46, 90, 78, 76, 55, 9};
        List<Integer> list = Arrays.asList(intArray);
        System.out.println("Sorting in descending order.");
        sortInDesc(list);
    }

    private static void sortInDesc(List<Integer> list) {
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
