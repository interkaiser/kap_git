package com.company.items;

public class Wine extends Item implements Alcohol, Perishable {
    private final int expiry_chance = 10;
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
