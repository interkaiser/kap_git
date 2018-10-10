package com.company.people;

import com.company.Item;
import com.company.Shop;

public class Cashier extends Person {
    public Cashier() {isInShop = true;}
    public Cashier(String name, double funds) {
        super(name, funds);
        isInShop = true;
    }
    public void sell(Item item) {
        if(!isInShop) {
            System.out.println(getName() + " is not in the shop!");
            return;
        }
        if(!items.contains(item)) {
            System.out.println(item.getName() + " is out of stock!");
            return;
        }
        items_sold++;
        int a = items.indexOf(item);
        if (amounts.get(a) > 1)
            amounts.set(a, amounts.get(a) - 1);
        else {
            amounts.remove(a);
            items.remove(item);
        }
    }
    public void getPaid(double wage) {
        if(!isInShop)
            return;
        get(wage);
        earn(-wage);
    }
}
