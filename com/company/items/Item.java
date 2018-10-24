package com.company.items;

public abstract class Item {
    private double cost = 0;
    Item() {}
    public Item(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }
    @Override
    public String toString() {
        return getClass().toString().substring(24);
    }
}
