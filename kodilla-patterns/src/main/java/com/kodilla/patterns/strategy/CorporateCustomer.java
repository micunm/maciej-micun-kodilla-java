package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new com.kodilla.patterns.strategy.BalancedPredictor();
    }
}
