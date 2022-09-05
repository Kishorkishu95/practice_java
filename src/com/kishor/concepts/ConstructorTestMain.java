package com.kishor.concepts;

public class ConstructorTestMain {
    public static void main(String[] args) {
        ConstructorTest test=new ConstructorTest();
        test.age=26;
        System.out.println(test.age+", "+test.name);
        ConstructorTest.print();
    }
}
