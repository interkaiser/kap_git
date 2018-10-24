package com.company.people;


public abstract class Person {
    private double wallet;
    public Person(double wallet) {
        this.wallet = wallet;
    }
    public double getWallet() {
        return wallet;
    }
    public void spendMoney(double s) {
        wallet -= s;
    }
}
