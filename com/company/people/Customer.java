package com.company.people;

import com.company.Shop;
import com.company.items.Alcohol;
import com.company.items.Item;

import java.util.ArrayList;
import java.util.Random;

public class Customer extends Person {
    private ArrayList<Item> bag;
    private Cashier buys_from;
    public Customer(double wallet) {
        super(wallet);
        bag = new ArrayList<>();
    }
    public void enterShop(Shop shop) {
        ArrayList<Cashier> temp = new ArrayList<>();
        for(Staff c : shop.getStaff())
            if(c instanceof Cashier)
                temp.add((Cashier)c);
        Random r = new Random();
        int i = r.nextInt(temp.size());
        buys_from = temp.get(i);
    }
    public void buy(Item item, int quan) {
        if(item instanceof Alcohol && this instanceof Youth) {
            System.out.println("Too young for alcohol!");
            return;
        }
        buys_from.sell(item, quan);
        spendMoney(item.getCost() * quan);
        for (int i = 0; i < quan; i++)
            bag.add(item);
    }
    public String getBag() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < bag.size(); i++)
            b.append(String.format("%s; ", bag.get(i).toString()));
        return b.append("\n").toString();
    }
}
