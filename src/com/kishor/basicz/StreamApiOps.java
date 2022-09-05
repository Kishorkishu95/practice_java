package com.kishor.basicz;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiOps {
    public static void main(String[] args) {
        // <R> Stream<R> map(Function<? super T,? extends R> mapper)
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8);
        List squares=nums.stream().map(x->x * x).collect(Collectors.toList());
        System.out.println(squares);
        // Stream<T> filter(Predicate<? super T> predicate)
        List<String> names=Arrays.asList("kishu","Ashwath","Vini","Sandy");
        List<String> result=names.stream().filter(name-> name.length()>=5).collect(Collectors.toList());
        System.out.println(result);
        // Stream<T> sorted()
        List<String> namesList=Arrays.asList("Kishu","Ashwath","Vini","Sandy","Sagar");
        List<String> sortedNames=namesList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
        


    }
}
