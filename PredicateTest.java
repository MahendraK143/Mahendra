package com.java8.predicates;

import com.java8.examples.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String arg[]){
        //System.out.println("Hollo Mahendra");
        Apple a5=new Apple("red",100,"Kerala",150);
        Apple a1=new Apple("gold",110,"Rajastan",120);
        Apple a2=new Apple("red",120,"Tamilnadu",110);
        Apple a3=new Apple("gold",110,"Karnataka",130);
        Apple a4=new Apple("yellow",140,"Andhra Pradesh",200);
        List<Apple> apples = new ArrayList<>();
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        apples.add(a4);
        apples.add(a5);
        System.out.println("All Apples List"+apples);
        //List<Apple> redApples = apples.stream().filter(a -> a.getColor().equals("red")).collect(Collectors.toList());
        //System.out.println("Red Apples List:"+redApples);
        List<Apple> redApples = getRedApplesList(apples,new RedApplePredicate());
        System.out.println("Red Apples List:"+redApples);
        List<Apple> apples110Cost = getApples110Cost(apples,new Cost110ApplePredicate());
        System.out.println("110rs Apples List:"+apples110Cost);

    }
    public static List<Apple> getRedApplesList(List<Apple> apples, Predicate<Apple> predicate){
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple:apples) {
            if (predicate.test(apple)) redApples.add(apple);
        }
        return redApples;
    }

    public static List<Apple> getApples110Cost(List<Apple> apples,Predicate<Apple> predicate){
        List<Apple> apples110Cost = new ArrayList<>();
        for (Apple apple:apples) {
            if (predicate.test(apple)) apples110Cost.add(apple);
        }
        return apples110Cost;
    }


}
