package com.kishor.basicz;

import java.util.stream.Stream;

public class StreamFindFirstValue {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Kishu", "Ashwath", "Vini", "Sandy", "Anu", "Sagar", "Reshma");
        System.out.println("First element of a Stream of names : " + findFirstElement(names));
    }

    private static String findFirstElement(Stream<String> names) {
//        String firstName = names.reduce((first, second) -> first).orElse(null);
        String firstName= names.findFirst().orElse(null);
        return firstName;
    }

}
