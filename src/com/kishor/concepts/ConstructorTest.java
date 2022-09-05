package com.kishor.concepts;

public class ConstructorTest {
    int age;
     String name;


     public ConstructorTest(){
         name="ki";
     }


    public ConstructorTest(int age, String name) {
        this.age=age;
        this.name=name;


    }



    static void print(){
        System.out.println("In private method.");
    }
}

