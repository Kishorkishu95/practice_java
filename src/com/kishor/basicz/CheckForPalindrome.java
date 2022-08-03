package com.kishor.basicz;

public class CheckForPalindrome {
    public static void main(String[] args) {
        // Palindrome is a word or sequence of characters produces the same word if it is reversed
        String s = "madam".toLowerCase();
        System.out.println("is Palindrome : " + checkForPalindrome(s));
    }

    private static boolean checkForPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            return true;
        }
        return false;
    }
}


