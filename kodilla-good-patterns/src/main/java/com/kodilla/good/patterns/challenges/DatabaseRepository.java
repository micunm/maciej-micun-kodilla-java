package com.kodilla.good.patterns.challenges;

public class DatabaseRepository implements OrdersRepository {
    @Override
    public void save(OrderRequest orderRequest) {
        System.out.println("Orders stored");
    }
}
