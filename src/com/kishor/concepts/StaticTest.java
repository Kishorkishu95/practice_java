package com.kishor.concepts;

public class StaticTest {
     static int num=m();

     private static String s="Kishor";

     static class nestedClass{
         public void disp(){
             System.out.println("Nested class : "+s);
         }

     }

     public StaticTest(){

     }
    public StaticTest(int num) {
        this.num = num;
    }

    static {
        System.out.println("In a static block.");
    }
    static int m(){

        System.out.println("In static method m().");
//        print();
        return 56;
    }
    void print(){
        System.out.println("In non-static method.");
    }

    public static void main(String[] args) {
//        System.out.println("Value of num : "+num);
        StaticTest.nestedClass nestedClass=new StaticTest.nestedClass();
        nestedClass.disp();

    }
}
