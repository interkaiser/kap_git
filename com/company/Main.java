package com.company;

import com.company.items.*;
import com.company.people.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop fiver = new Shop(1000000);
        Item bread = new Bread();
        Item beer = new Beer();
        Item fruit = new Fruit();
        Item milk = new Milk();
        Item wine = new Wine();
        fiver.getShipment(bread, 500);
        fiver.getShipment(beer, sc.nextInt());
        fiver.getShipment(fruit, 1000);
        fiver.getShipment(milk, 300);
        Staff boris = new Cashier(sc.nextInt());
        Staff pyotr = new Cashier(1000);
        Staff ivan = new Janitor(500);
        Customer vasya = new Youth(5000);
        Customer vladimir = new Customer(10000);
        fiver.accept(boris);
        fiver.accept(ivan);
        fiver.accept(pyotr);
        fiver.startDay();
        vasya.enterShop(fiver);
        vladimir.enterShop(fiver);
        vasya.buy(bread, 1);
        vasya.buy(beer, 2);
        vladimir.buy(wine, 1);
        vladimir.buy(fruit, 10);
        vladimir.buy(milk, 3);
        fiver.endDay();
        System.out.println(vasya.getBag());
        System.out.println(vladimir.getBag());
    }
}
