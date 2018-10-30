package com.java8.examples;

public class Apple {
    private String color;
    private Double cost;
    private String place;
    private Double weight;

    public Apple(String color, double cost, String place, double weight) {
        this.color = color;
        this.cost = cost;
        this.place = place;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", place='" + place + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static class Menu {
    }
}
