package com.kodilla.good.patterns.challenges;

public class ExtraFoodShopService implements FoodDeliveryService {
    @Override
    public boolean process(ProductReadyToDelivery productReadyToDelivery) {
        return false;
    }
}
