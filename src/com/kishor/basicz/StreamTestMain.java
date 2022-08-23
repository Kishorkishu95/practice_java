package com.kishor.basicz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestMain {
    public static void main(String[] args) {
        Stream<Integer> streams = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // Creating stream from an array
        Stream<Integer> stream = Stream.of(new Integer[]{1, 3, 5, 7, 9});
        // Creating stream from a list
        List<String> list = new ArrayList<>();
        // Stream<String> strStream=Stream.of(new String[]{"Kishu","Anu","Sandy","Sushma"});
        list.add("Kishu");
        list.add("Anu");
        list.add("Sandy");
        list.add("Sushma");
        Stream<String> strStream = list.stream();
//        strStream.forEach(a-> System.out.print(a+", "));
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
//        randomNumbers.limit(20).forEach(s-> System.out.print(s+ ", "));
        List<Integer> listNums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNums.add(i);
        }
        Stream<Integer> intStreams = listNums.stream();
        //Collecting as list
        List<Integer> ls = intStreams.filter(s -> s % 2 == 0).collect(Collectors.toList());
        // System.out.println(ls);
        // Collecting as an array
//        int[] ints= intStreams.filter(m->m%2==0).mapToInt(x->x).toArray();
//        for(int e:ints){
//            System.out.print(e+", ");
//        }
//    }
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Kishu");
        memberNames.add("Anusha");
        memberNames.add("Sandy");
        memberNames.add("Aakanksha");
        memberNames.add("Reshma");
        memberNames.add("Sameer");
        memberNames.add("Harish");
        memberNames.add("Hori");
        memberNames.add("Sandhya");
      List<String> names=  memberNames.stream().filter(name->name.length()<=5).map(na->na.toUpperCase()).collect(Collectors.toList());
        System.out.println(names);
        long val=memberNames.stream().count();
      //  System.out.println(val);
       // System.out.println(memberNames.stream().anyMatch((s)->s.startsWith("A")));
       Optional<String> red= memberNames.stream().reduce((s1, s2)->s1+"#"+s2);
        System.out.println(red);


        //  memberNames.stream().filter(name->name.length()<=5).map(na->na.toUpperCase()).forEachOrdered(s-> System.out.println(s));
        //memberNames.stream().filter(name->name.length()>=5).forEach(s-> System.out.println(s));
        //memberNames.stream().sorted().forEach(s -> System.out.println(s));
        //memberNames.stream().filter((s) -> s.startsWith("K")).forEach(name-> System.out.println(name));
    }
}
