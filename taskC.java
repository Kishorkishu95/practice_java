package com.kishor.strings;

public class taskC {
    public static void main(String[] args) {
        // Find and return the smallest and largest substrings based on lexicographically
        String s="welcomekishor";
        int k=3;
        System.out.println(findSmallestLargest(s,k));
    }

    private static String findSmallestLargest(String str,int len) {
        String smallest=str.substring(0,len);
        String largest=str.substring(0,len);
        for (int i=0;i<str.length()-len+1;i++){
            String sub=str.substring(i,i+len);
            if(sub.compareTo(smallest)<0){
                smallest=sub;
            }
            if(sub.compareTo(largest)>0){
                largest=sub;
            }
        }
        return smallest+"\n"+largest;
    }
}
