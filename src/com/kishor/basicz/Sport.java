package com.kishor.basicz;

public interface Sport {
    String s="Kishor";
    void circket();
    void football();

    default void tennis(){
        System.out.println("Tennis() - From Java 8 features, Default method has body.");
    }
    static void hockey(){
        System.out.println("Hockey() - From Java 8 features, Static method has body.");
    }
}
abstract class SportImpl implements Sport{


    static {
        System.out.println("In a SportImpl class,static block1.");
    }
    void cricket(){
        System.out.println("Cricket() - Playing cricket.");
    }
}
class A extends SportImpl{

    @Override
    public void circket() {
        System.out.println("2nd Implementation from class A.");
    }

    @Override
    public void football() {
        System.out.println("1st implementation from class A.");
    }

    @Override
    public void tennis() {
//        super.tennis();
        System.out.println("2nd implentation from class A.");
    }
    static {
        System.out.println("In a SportImpl class,static block2.");
    }
}
