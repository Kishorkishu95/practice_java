package com.kishor.concepts;

public abstract class AbstractTest {
    String color;
    abstract double area();
    abstract void set();



    public abstract String toString();

    public AbstractTest(String color){
        System.out.println("constructor called.");
        this.color=color;
    }
    public String getColor(){
        return color;
    }
     void sayHi(){
        System.out.println("Hi from non abstract method.");
    }

}
class BaseClass extends AbstractTest{
    double rad;

    public BaseClass(String color,double rad){
        super(color);
        System.out.println("Baseclass constructor called.");
        this.rad=rad;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(rad,2);
    }

    @Override
    void set() {
        System.out.println("Overridden method.");
    }

    @Override
    public String toString() {
        return super.getColor()+", "+area();
    }
}
class Rectangle extends AbstractTest{
    double len;
    double width;

    public Rectangle(String color,double len,double width){
        super(color);
        System.out.println("Rectangle constructor called.");
        this.len=len;
        this.width=width;
    }

    @Override
    double area() {
        return len*width;
    }

    @Override
    void set() {
        System.out.println("rectangle class.");

    }

    @Override
    public String toString() {
        return super.getColor()+", "+area();
    }
}

