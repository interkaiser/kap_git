package com.company;

import com.company.people.*;

public class Main {
    public static void trade(Item item, Customer u, Cashier a) {
        a.sell(item);
        u.purchase(item);
    }
    public static void main(String[] args) {
        Shop chetvorochka = new Shop(1000000.0);
        Cashier p = new Cashier("Pyotr", 3000);
        Cashier v = new Cashier();
        Customer i = new Customer();
        Customer r = new Customer("Vladimir", 10000);
        Item meat = new Item("Meat", 27.5);
        Item milk = new Item("Milk", 60);
        Item bread = new Item("Bread", 10);
        Item sugar = new Item("Sugar", 20.15);
        chetvorochka.getShipment(sugar, 100);
        chetvorochka.getShipment(bread, 500);
        i.enter();
        r.enter();
        trade(bread, i, p);
        trade(milk, r, v);
        trade(meat, r, p);
        v.getPaid(20000);
        System.out.println(r.getBag());
        System.out.println(v.getCash());
        System.out.println(r.getCash());
    }
}
