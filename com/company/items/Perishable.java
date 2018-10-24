package com.company.items;

public interface Perishable {
    void expire();
    boolean isExpired();
    int getExpiryChance();
}
