package com.java8.examples;

public class Dish {
    private int id;
    private String name;
    private double cost;
    private double calaries;
    private boolean isVegetarian;
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCalaries() {
        return calaries;
    }

    public void setCalaries(double calaries) {
        this.calaries = calaries;
    }

    public Dish(int id) {
        this.id = id;
    }

    public Dish(int id, String name, double cost, double calaries, boolean isVegetarian,String type) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.calaries = calaries;
        this.isVegetarian = isVegetarian;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", calaries=" + calaries +
                ", isVegetarian=" + isVegetarian +
                ", type='" + type + '\'' +
                '}';
    }

    enum Type{
        MEAT,CHICKEN,FISH,BEEF,VEG;
    }
}
