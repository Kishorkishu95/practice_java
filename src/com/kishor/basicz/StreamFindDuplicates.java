package com.kishor.basicz;

import java.util.*;
import java.util.stream.Collectors;


public class StreamFindDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        System.out.println("Duplicates are : " + findDuplicates(nums));
    }

    private static Set<Integer> findDuplicates(List<Integer> nums) {
        return nums.stream().filter(num -> Collections.frequency(nums, num) > 1).collect(Collectors.toSet());
    }

//    private static Set<Integer> findDuplicates(Stream<Integer> nums) {
//        Set<Integer> duplicates = new HashSet<>();
//        return nums.filter(num -> !duplicates.add(num)).collect(Collectors.toSet());
//    }
}
