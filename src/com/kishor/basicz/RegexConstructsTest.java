package com.kishor.basicz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexConstructsTest {
    public static void main(String[] args) {
        String str="cat";
//        String regex="^\\d{10}$";
//        String regex="^[a-zA-Z0-9]+$";
        String regex="^cat|dog$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(str);
        boolean b=matcher.matches();
        System.out.println(b);
    }
}
