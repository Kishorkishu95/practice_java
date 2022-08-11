package com.kishor.basicz;

public class StreamCharCount {
    public static void main(String[] args) {
        String name="madam";
        char c='a';
        System.out.println("Character "+c+" occurred "+countOccurance(name,c)+" times.");
    }

    private static Integer countOccurance(String str, char c) {
        return Math.toIntExact(str.chars().filter(ch -> ch == c).count());
    }
}
