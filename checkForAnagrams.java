package com.kishor.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class checkForAnagrams {
    public static void main(String[] args) {
        String s1="madam";
        String s2="Hello";
        System.out.println(areAnagrams(s1,s2));
    }

    private static boolean areAnagrams(String s1, String s2) {
       int s1Len=s1.length();
       int s2Len=s2.length();
       if(s1Len!=s2Len){
           return false;
       }
       char[] ch1=s1.toCharArray();
       char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<s1Len;i++){
            if(ch1[i]==ch2[i]){
                return true;
            }
        }
        return false;
    }
}
