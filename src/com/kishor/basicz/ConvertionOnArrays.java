package com.kishor.basicz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertionOnArrays {
    public static void main(String[] args) {
        // Array to List conversion
        Integer[] intArray={1,2,3,4,5,6,7,8};
        List<Integer> list=  Arrays.asList(intArray);
        System.out.println(list);
        // List to Array conversion
        List<Integer> listVal=new ArrayList<>();
        listVal.add(1);
        listVal.add(2);
        listVal.add(3);
        listVal.add(4);
        Integer[] arr=new Integer[listVal.size()];
        listVal.toArray(arr);
        for(Integer i:arr){
            System.out.print(i+" ");
        }
    }
}
