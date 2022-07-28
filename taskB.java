package com.kishor.strings;

public class taskB {
    public static void main(String[] args) {
        // 1. Find and display a substring for the given range
        String s =new String("Alphabet");
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(2));
        System.out.println(s.subSequence(5,s.length()));
    }
}
