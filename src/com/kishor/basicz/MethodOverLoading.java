package com.kishor.basicz;

public class MethodOverLoading {
    void print(){
        System.out.println("Ashwath is getting his Himalayan next month.");
    }
}
class Sample extends MethodOverLoading{
    @Override
    void print() {
        System.out.println("I am taking KTM Adventure 250.");
    }
}
