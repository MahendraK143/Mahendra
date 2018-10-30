package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestStream {
    public static void main(String arg[]){
        List<String> list = Arrays.asList("1","2","3","4");
        Predicate<String> id= e -> e.equalsIgnoreCase("4");
        boolean t=list.contains(""+1);
        System.out.println(t);
    }
}
