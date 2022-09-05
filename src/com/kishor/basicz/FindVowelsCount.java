package com.kishor.basicz;

import java.util.HashMap;

public class FindVowelsCount {
    public static void main(String[] args) {
        String str = ("a set of words that is complete in itself, typically containing a subject and predicate, conveying a statement, " +
                "question, exclamation, or command, and consisting of a main clause and sometimes one or more subordinate clauses.").toUpperCase();
        int vCount = 0;
        System.out.println(str.length());
        HashMap<Character, Integer> cc = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
//                vCount++;
                if (cc.containsKey(str.charAt(i))) {
                    cc.put(str.charAt(i), cc.get(str.charAt(i)) + 1);
                }
                else {
                cc.put(str.charAt(i), 1);
                vCount++;
                }

            }
        }
        System.out.println(vCount);
        cc.forEach((x, y) -> System.out.println(x + " - " + y));
//        System.out.println("Vowels count : "+vCount);
    }
}
