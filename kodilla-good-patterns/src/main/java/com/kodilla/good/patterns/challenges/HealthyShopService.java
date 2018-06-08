package com.kodilla.good.patterns.challenges;

public class HealthyShopService implements FoodDeliveryService {
    @Override
    public boolean process(ProductReadyToDelivery productReadyToDelivery) {
        System.out.println("Delivery from the Healthy Shop is being processed.");
        return true;
    }
}
