package com.kishor.basicz;

public class ThisKeyword {
    public static void main(String[] args) {
        ThisTest test=new ThisTest();
        test.display();
        test.get().display();
        test.getPrint();
    }
}
