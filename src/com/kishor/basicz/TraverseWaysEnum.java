package com.kishor.basicz;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Stream;

public class TraverseWaysEnum {
    public enum Seasons{
                SPRING,
                SUMMER,
                MONSOON,
                AUTUMN,
                WINTER
    }

    public static void main(String[] args) {
        // 1st way - Convert enum to set and apply forEach()
        System.out.println("1st way - Convert enum to set and apply forEach()");
        EnumSet.allOf(Seasons.class).forEach(s-> System.out.println(s));
        // 2nd way - Convert enum to ArrayList and apply forEach()
        System.out.println("2nd way - Convert enum to ArrayList and apply forEach()");
        Arrays.asList(Seasons.values()).forEach(season->{
            System.out.println(season);
        });
        System.out.println("3rd way - apply for loop");
        for(Seasons s: Seasons.values()){
            System.out.println(s);
        }
        System.out.println("4th way - Using Stream()");
        Stream.of(Seasons.values()).forEach(season -> System.out.println(season) );
    }
}
