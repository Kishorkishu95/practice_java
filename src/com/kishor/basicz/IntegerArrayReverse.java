package com.kishor.basicz;

import java.util.Scanner;

public class IntegerArrayReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num of elements : ");
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        for(int j=nums.length-1;j>=0;j--){
            System.out.println(nums[j]+" ");
        }

    }
}
