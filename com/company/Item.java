package com.company;

public class Item {
    private String name;
    private double cost;
    public Item() {
        name = "";
        cost = 0;
    }
    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }
    public  String getName() {
        return name;
    }
    public double bulkCost(int amount) {
        return cost * amount - amount + 1;
    }
    @Override
    public String toString() {
        return  String.format("%s, %.1f; ", name, cost);
    }
}
