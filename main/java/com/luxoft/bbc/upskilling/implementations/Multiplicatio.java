package com.luxoft.bbc.upskilling.implementations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Multiplicatio {

    private static int[] dbl(final int[] input) {
        return Arrays.stream(input)
                .map(x -> x * 2)
                .toArray();
    }


    public static void main(String[] args) {
        int[] tst = {10, 20,40,50};
        Arrays.stream(tst)
                .forEach(System.out::println);

        Arrays.stream(dbl(tst))
                .forEach(System.out::println);


//        List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
//        IntStream.range(0, list.size())
//                .filter(n -> n % 3 == 0)
//                .mapToObj(list::get)
//                .collect(Collectors.toList());
//
//        List.stream(list)
//                .forEach(System.out::println);

//        List<String> myList =
//                Arrays.asList("a1", "a2", "b1", "c2", "c1");
//
//        myList
//                .stream()
//                .filter(s -> s.startsWith("c"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);


    }
}
