package com.kishor.basicz;

public class Fruit {
    int price=200;

   static final String name;
    static {
        name="Apple";
    }



    final void printName(){
        System.out.println("Name : "+name);
    }
    public Fruit(){
        System.out.println("Fruit constructor.");
    }
    void fruitPrint(){
        System.out.println("Fruit class - price is "+price);
    }
}
class Mango extends Fruit{
    int price=250;

     void printName(int p){
         System.out.println("Price from Mango : "+price);
     }
    public Mango(){
//        super();
        System.out.println("Mango class constructor.");
    }
    void display(){
        System.out.println("Price of Fruit is - from super keyword : "+super.price);
        System.out.println("Price of Mango is : "+price);
        // will invoke or call parent class message() method
        super.fruitPrint();
        printName(300);
    }
}
