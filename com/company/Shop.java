package com.company;

import java.util.ArrayList;

public class Shop {
    protected int items_sold;
    private double funds;
    protected ArrayList<Item> items = new ArrayList<>(0);
    protected ArrayList<Integer> amounts = new ArrayList<>(0);
    public Shop() {
        funds = 0;
    }
    public Shop(double money) {
        funds = money;
    }
    public void earn(double amount) {
        funds += amount;
    }
    public void getShipment(Item item, int amount) {
        double a = item.bulkCost(amount);
        if(funds >= a) {
            items.add(item);
            amounts.add(amount);
            funds -= a;
        } else
            System.out.println("Too expensive, shipment has to be smaller!");
    }
}
