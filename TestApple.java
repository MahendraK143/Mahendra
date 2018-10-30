package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestApple {
    public static void main(String arg[]){
        //System.out.println("Hollo Mahendra");
        Apple a5=new Apple("red",100,"Kerala",150);
        Apple a1=new Apple("gold",110,"Rajastan",120);
        Apple a2=new Apple("red",120,"Tamilnadu",110);
        Apple a3=new Apple("gold",110,"Karnataka",130);
        Apple a4=new Apple("yellow",140,"Andhra Pradesh",200);
        List<Apple> apples = Arrays.asList(a1,a2,a3,a4,a5);
        System.out.println("All Apples List"+apples);
        //List<Apple> redApples = apples.stream().filter(a -> a.getColor().equals("red")).collect(Collectors.toList());
        //System.out.println("Red Apples List:"+redApples);
        List<Apple> redApples = getRedApplesList(apples);
        System.out.println("Red Apples List:"+redApples);
        List<Apple> goldApples = getGoldApplesList(apples);
        System.out.println("Red Apples List:"+redApples);
        List<Apple> apples110Cost = getApples110Cost(apples);
        System.out.println("110rs Apples List:"+apples110Cost);

    }
    public static List<Apple> getRedApplesList(List<Apple> apples){
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple:apples) {
            if (apple.getColor().equals("red")) redApples.add(apple);
        }
        return redApples;
    }
    public static List<Apple> getGoldApplesList(List<Apple> apples){
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple:apples) {
            if (apple.getColor().equals("gold")) redApples.add(apple);
        }
        return redApples;
    }

    public static List<Apple> getApples110Cost(List<Apple> apples){
        List<Apple> apples110Cost = new ArrayList<>();
        for (Apple apple:apples) {
            if (apple.getCost()==110) apples110Cost.add(apple);
        }
        return apples110Cost;
    }

}
