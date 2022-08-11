package com.kishor.basicz;

import java.util.Arrays;
import java.util.List;

public class StreamMaxFinder {
    public static void main(String[] args) {
        Integer intArray[] = {5, 20, 22, 89, 46, 90, 78, 76, 55, 9};
        System.out.println("Max value in a given array is : " + maxFinder(intArray));
    }
    private static Integer maxFinder(Integer arr[]) {
        List<Integer> list=Arrays.asList(arr);
        int max = list.stream().max(Integer::compare).get();
        return max;
    }
}
