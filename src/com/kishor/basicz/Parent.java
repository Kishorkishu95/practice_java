package com.kishor.basicz;

public class Parent {
    void print(){
        System.out.println("Parent print().");
    }
}
class Subclass1 extends Parent{
    void print(){
        System.out.println("Subclass1 print().");
    }
}
class Subclass2 extends Parent{
    void print(){
        System.out.println("Subclass2 print().");
    }
}
