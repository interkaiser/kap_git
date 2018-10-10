package com.company.people;

import com.company.Item;

import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList bag = new ArrayList(0);
    public Customer() {}
    public Customer(String name, double cash) {
        super(name, cash);
    }
    public void purchase(Item item) {
        if(!isInShop) {
            System.out.println(getName() + " is not in the shop!");
            return;
        }
        if(!items.contains(item)) {
            System.out.println(item.getName() + " is out of stock!");
            return;
        }
        if(cash >= item.getCost()) {
            if (items_sold > 0) {
                get(-item.getCost());
                int a = items.indexOf(item);
                if (bag.contains(item)) {
                    bag.set(a, amounts.get(a) - 1);
                } else {
                    bag.add(item);
                    bag.add(1);
                }
                amounts.set(a, amounts.get(a) - 1);
            }
        } else System.out.println(this.getName() + " can't afford " + item.getName() + "!");
    }
    public String getBag() {
        StringBuilder s = new StringBuilder();
        s.append(getName() + " has:\n");
        if(!bag.isEmpty()) {
            for (int i = 0; i < bag.size(); i += 2) {
                s.append(bag.get(i).toString());
                s.append(bag.get(i + 1) + "\n");
            }
        } else
            s.append("Nothing");
        return s.toString();
    }
}
