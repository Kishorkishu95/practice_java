package com.kishor.basicz;

public class IterateArrayWays {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 1st way - Using for loop
        System.out.println("1st way - Using for loop");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        // 2nd way - Using forEach or Enhanced for loop
        System.out.println();
        System.out.println("2nd way - Using forEach or Enhanced for loop");
        for (Integer i : intArray
        ) {
            System.out.print(i + " ");
        }
    }
}
