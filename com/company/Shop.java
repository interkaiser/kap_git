package com.company;

import com.company.items.Item;
import com.company.items.Perishable;
import com.company.people.*;

import java.util.ArrayList;
import java.util.Random;

public class Shop {
    private double funds;
    private ArrayList<Item> stock;
    private ArrayList<Staff> staff;
    public Shop(double funds) {
        this.funds = funds;
        stock = new ArrayList<>();
        staff = new ArrayList<>();
    }
    public ArrayList<Item> getStock() {
        return stock;
    }
    public ArrayList<Staff> getStaff() {
        return staff;
    }
    public void getShipment(Item item, int quan) {
        double c = item.getCost();
        funds -= c * quan - (quan - 1) / c;
        for (int i = 0; i < quan; i++)
            stock.add(item);
    }
    public void accept(Staff member) {
        staff.add(member);
        member.setJob(this);
    }
    public void remove(Item item) {
        stock.remove(item);
    }
    public void startDay() {
        for(Staff s : staff)
            if(s instanceof Janitor)
                ((Janitor)s).clean();
    }
    public void endDay() {
        for(Staff s : staff) {
            s.getPaid();
            if(s instanceof Cashier)
                funds += ((Cashier)s).getRegister();
        }
        Random r = new Random();
        for(Item i : stock) {
            if(i instanceof Perishable)
                if (r.nextInt(((Perishable)i).getExpiryChance()) == 0)
                    ((Perishable)i).expire();
        }
    }
}
