package com.kishor.basicz;

public class taskA {
    public static void main(String[] args) {
        // 1. Find and Display sum of the given Strings length
        // 2. Check for equality of content and lexicographically
        // 3. Replace the first character of every String and make it capital
        // 4. Concat the two Strings and display the same.
        String s1="Hello";
        String s2="World";
        String s3="Hello";
        String s4="hello";
        System.out.println(s1.length()+s2.length()+s3.length());
        System.out.println(s1.compareTo(s3)==0?"Same":"Not");
        System.out.println(s1.equals(s2)?"Same":"Different");
        System.out.println(s1.equals(s3)?"Same":"Different");
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.contentEquals("Hello"));
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1,s1.length()) +" "+s2.substring(0,1).toUpperCase()+s2.substring(1,s2.length()));
    }
}
