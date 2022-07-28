package com.kishor.strings;

public class SplitStringTest {
    public static void main(String[] args) {
        String str="He is a very very good boy, isn't he?";
        str=str.trim();
        if(str.length()==0){
            System.out.println(0);
            return;
        }
        else{
            String[] tokens=str.split("[^A-Za-z]+");
            System.out.println(tokens.length);
            for(String token:tokens){
                System.out.println(token);
            }
        }

    }
}
