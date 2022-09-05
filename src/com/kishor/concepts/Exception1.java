package com.kishor.concepts;

public class Exception1 {
    public static void main(String[] args) {
        int a=30;
        int b=0;
        try {
            System.out.println(a/b);
        }
        catch (Exception exception){
            exception.printStackTrace();

        }
        finally {
            System.out.println("End...");
        }

    }
}
