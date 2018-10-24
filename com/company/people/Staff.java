package com.company.people;

import com.company.Shop;

public abstract class Staff extends Person {
    private int wage;
    private Shop works_at;
    public Staff (int wage) {
        super(0);
        this.wage = wage;
    }
    public void getRaise(int s) {
        wage += s;
    }
    public int getWage() {
        return wage;
    }
    protected Shop getJob() {
        return works_at;
    }
    public void setJob(Shop job) {
        works_at = job;
    }
    public abstract void getPaid();
}
