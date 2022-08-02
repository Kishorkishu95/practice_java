package com.kishor.basicz;

public class StringReverse {
    public static void main(String[] args) {
        String str = "kishor";
        System.out.println("Reversed version of " + str + " is : " + reverseString(str));

    }

    private static String reverseString(String s) {
        char[] chrs = s.toCharArray();
        String rev = "";
        for (int i = chrs.length - 1; i >= 0; i--) {
            rev += chrs[i];
        }
        return rev;
    }
}
