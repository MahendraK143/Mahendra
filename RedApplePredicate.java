package com.java8.predicates;

import com.java8.examples.Apple;

import java.util.function.Predicate;
/*
A functional interface is defined as any interface that has exactly one explicitly declared abstract method.
(The qualification is necessary because an interface may have non-abstract default methods.)
This is why functional interfaces used to be called Single Abstract Method (SAM) interfaces
*/
public class RedApplePredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
