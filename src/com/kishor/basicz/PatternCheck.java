package com.kishor.basicz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Regex : ");
        int testCases= Integer.parseInt(in.nextLine());
        while(testCases>0){
            testCases--;
            String pattern=in.nextLine();

            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }

        }
    }
}
