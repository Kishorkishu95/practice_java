package com.kishor.basicz;

import java.util.stream.Stream;

public class StreamFindLastValue {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Kishu", "Ashwath", "Vini", "Sandy", "Anu", "Sagar", "Reshma");
        System.out.println("Last element of a Stream of names : " + findLastElement(names));
    }

    private static String findLastElement(Stream<String> names) {
        String lastName = names.reduce((first, second) -> second).orElse(null);
//        String lastName= names.skip().orElse(null);
        return lastName;
    }

}
