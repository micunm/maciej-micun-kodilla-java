package com.kodilla.good.patterns.challenges;

public class ExtraFoodShopService implements FoodDeliveryService {
    @Override
    public boolean process(ProductReadyToDelivery productReadyToDelivery) {
        System.out.println("Delivery from the Extra Food Shop is being processed.");
        return false;
    }
}
