package com.kishor.basicz;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        int min=2000;
        int max=4000;
        int rand= (int) Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Random number : "+rand);
//        Random random=new Random();
//        int num=random.nextInt(2500);
//        System.out.println("Random number is : "+num); //2861,2161,4915

    }
}
