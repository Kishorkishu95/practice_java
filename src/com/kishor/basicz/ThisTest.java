package com.kishor.basicz;

public class ThisTest {

    // Java code for using 'this' keyword to refer current class instance variables
    int a;
    int b;

    // Java code for using this() to invoke current class constructor
    ThisTest(){
        this(15,20);
        System.out.println("In current class constructor. No argument constructor");
    }
    // Method that returns current class instance
    ThisTest get(){
        return this;
    }
    ThisTest(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("In a parameterised constructor.");
    }
    // Method that receives 'this' keyword as parameter
    void print(ThisTest t){
        System.out.println(t.a+", "+t.b);
    }
    void getPrint(){
        print(this);
        // Java code for using this to invoke current class method
        System.out.println("In getPrint() method.");
        this.display();
    }

    public void display(){
        System.out.println(a+", "+b);
    }
}
