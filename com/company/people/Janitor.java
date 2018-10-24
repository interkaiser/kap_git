package com.company.people;

import com.company.items.Item;
import com.company.items.Perishable;

public class Janitor extends Staff {
    private int thrown;
    public Janitor(int wage) {
        super(wage);
    }
    public void clean() {
        for(Item i : getJob().getStock())
            if(i instanceof Perishable)
                if(((Perishable)i).isExpired()) {
                    getJob().remove(i);
                    thrown++;
                }
    }
    @Override
    public void getPaid() {
        double pay = (double)thrown * getWage() / 100;
        spendMoney(-pay);
    }
}
