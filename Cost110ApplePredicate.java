package com.java8.predicates;

import com.java8.examples.Apple;

import java.util.function.Predicate;

public class Cost110ApplePredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getCost()==110;
    }
}
