package com.java8.examples;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.util.stream.Collectors;

public class TestMenu {
    public static void main(String argp[]){
        Dish d1 = new Dish(1,"GOAT",50,500,false,"MEAT");
        Dish d2 = new Dish(2,"french fries",60,350,false,"VEG");
        Dish d3 = new Dish(3,"Rice",70,700,false,"VEG");
        Dish d4 = new Dish(4,"season fruit",45,400,false,"VEG");
        Dish d5 = new Dish(5,"Chicken",30,550,true,"CHICKEN");
        List<Dish> menu = Arrays.asList(d1,d2,d3,d4,d5);

        List<String> names  = menu.stream().filter(dish -> dish.getCalaries()<= 400)
                .sorted(Comparator.comparing(Dish::getCalaries))
                .map(dish -> dish.getName()).collect(Collectors.toList());
        System.out.println(names);
        //To exploit a multicore architecture and execute this code in parallel, you need only change stream() to parallelStream():
        List<String> namesp  = menu.parallelStream().filter(dish -> dish.getCalaries()<= 400)
                .sorted(Comparator.comparing(Dish::getCalaries))
                .map(dish -> dish.getName()).collect(Collectors.toList());
        System.out.println(namesp);
        List<String> namesv  = menu.stream().filter(dish -> dish.isVegetarian()).map(Dish::getName).collect(Collectors.toList());
        System.out.println(namesv);
        List<Dish> vdish = menu.stream().filter(dish -> dish.isVegetarian()).collect(Collectors.toList());
        System.out.println(vdish);

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4); numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
        List<Dish> dishes=menu.stream().filter(dish -> !dish.getType().equals(Dish.Type.VEG)).limit(2).collect(Collectors.toList());
        System.out.println(dishes);
        List<Integer> dishNameLengths = menu.stream() .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(dishNameLengths);
        System.out.println(menu.stream().allMatch(dish -> dish.getCost()>10));
        System.out.println(menu.stream().noneMatch(dish -> dish.getCost()>10));
        Optional<Dish> ddd=menu.stream().filter(dish -> !dish.isVegetarian()).findAny();
        System.out.println(ddd);
        //how to find num of dishes available using map and reduce methods
        int count = menu.stream() .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        long count1 = menu.stream().count();
        System.out.print(count1);
    }
}
