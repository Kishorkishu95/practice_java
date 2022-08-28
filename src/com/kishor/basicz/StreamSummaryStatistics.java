package com.kishor.basicz;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class StreamSummaryStatistics {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        IntSummaryStatistics intSummaryStatistics= Arrays.stream(arr).summaryStatistics();
        System.out.println("Sum : "+intSummaryStatistics.getSum());
        System.out.println("Average : "+intSummaryStatistics.getAverage());
        System.out.println("Max : "+intSummaryStatistics.getMax());
        System.out.println("Min : "+intSummaryStatistics.getMin());
        System.out.println("Count : "+intSummaryStatistics.getCount());
    }
}
