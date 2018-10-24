package com.company.people;


import com.company.items.Item;

public class Cashier extends Staff {
    private double register;
    private int items_sold;
    public Cashier (int wage) {
        super(wage);
        register = 0;
    }
    public void sell(Item item, int quan) {
        for (int i = 0; i < quan; i++) {
            if (!getJob().getStock().contains(item)) {
                System.out.printf("%s is out of stock!\n", item.toString());
                return;
            }
            getJob().remove(item);
            register += item.getCost();
            items_sold++;
        }
    }
    @Override
    public void getPaid() {
        double pay = (double)items_sold * getWage() / 100;
        spendMoney(-pay);
    }
    public double getRegister() {
        return register;
    }
}
