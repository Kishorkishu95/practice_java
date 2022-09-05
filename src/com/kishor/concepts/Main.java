package com.kishor.concepts;


public class Main {
    public static void main(String[] args) {
        AbstractTest test=new BaseClass("green",12);
        AbstractTest test1=new Rectangle("yellow",2,4);
        System.out.println(test.toString());
        System.out.println(test1.toString());
    }
}

