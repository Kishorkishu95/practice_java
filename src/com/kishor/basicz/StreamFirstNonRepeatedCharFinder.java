package com.kishor.basicz;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFirstNonRepeatedCharFinder {
    public static void main(String[] args) {
        String str = "Java Hungry Blog Alive is Awesome";
        System.out.println(findFirstNonRepeatedCharOfString(str));
    }

    private static char findFirstNonRepeatedCharOfString(String str) {
        Character ch = str.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
//                .filter(e -> e.getValue() == 1L)
                .filter(e -> e.getValue() > 1L) // To find first repeated character
                .map(e -> e.getKey())
                .findFirst()
                .get();
        return ch;
    }
}
