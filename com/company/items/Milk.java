package com.company.items;

public class Milk extends Item implements Perishable {
    private final int expiry_chance = 5;
    boolean expired = false;
    @Override
    public void expire() {
        expired = true;
    }
    @Override
    public boolean isExpired() {
        return expired;
    }
    @Override
    public int getExpiryChance() {
        return expiry_chance;
    }
}
