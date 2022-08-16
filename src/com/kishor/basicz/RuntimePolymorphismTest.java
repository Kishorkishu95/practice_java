package com.kishor.basicz;

public class RuntimePolymorphismTest {
    public static void main(String[] args) {
        Parent p;
        p=new Parent();
        p.print();
        p=new Subclass1();
        p.print();
        p=new Subclass2();
        System.out.println(p instanceof Parent);
        p.print();
    }
}
