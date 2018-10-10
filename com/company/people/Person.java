package com.company.people;

import com.company.Shop;

public abstract class Person extends Shop {
    protected double cash;
    protected boolean isInShop = false;
    private static String name;
    public Person() {
        cash = 0;
        name = "Ivan";
    }
    public Person(String name, double cash) {
        this.cash = cash;
        this.name = name;
    }
    public void enter() {
        isInShop = true;
    }
    public void leave() {
        isInShop = false;
    }
    public void get(double a) {
        cash += a;
    }
    public String getName() {
        return name;
    }
    public double getCash() {
        return cash;
    }
}
