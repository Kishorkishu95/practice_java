package com.kishor.basicz;

public interface DefaultStaticMethods {

    public static final String str="Kishor";
    default void print(){
        System.out.println("In default method.");
    }
    static void say(){
        System.out.println("In static method.");
    }
    void sayHello();

}
class C implements DefaultStaticMethods{

    @Override
    public void sayHello() {
        System.out.println("Say hello to Ashwath.");
    }
}
