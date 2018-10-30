package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomeTestUsingStreams {
    public static void main(String[] arg){
        List<String> nodup = new ArrayList<>(Arrays.asList("Goodbye","World"))
                .stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nodup);
        List<Integer> sq = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))
                .stream().map(i -> i*i)
                .collect(Collectors.toList());
        System.out.println(sq);
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[]{i,j})).collect(Collectors.toList());
        System.out.println(pairs);
        //pairs.stream().forEach(ints -> ints.toString());
        List<int[]> pairsD3 = numbers1.stream().flatMap(i -> numbers2.stream().
                filter(j -> (i+j)%3==0).map(j-> new int[]{i,j})).collect(Collectors.toList());
        System.out.println(pairsD3);
        //pairs.stream().map(ints -> Arrays.stream(ints)).map(int->System::print).
    }

}
