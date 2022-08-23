package com.kishor.basicz;

import java.util.Arrays;
import java.util.List;

public class MedianFinder {
    public static void main(String[] args) {
       int[] intArr={1,2,3,4,8,5,6,9};
       Arrays.sort(intArr);
       double median = 0;
       if(intArr.length%2==0){
           median= ((intArr[intArr.length/2] + intArr[intArr.length/2 - 1])/2);
       }
       else{
           median=intArr[intArr.length/2];
       }
        System.out.println("Median is : "+median);
    }
}
