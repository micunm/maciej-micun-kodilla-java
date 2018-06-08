package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class GlutenFreeShopService implements FoodDeliveryService {
    @Override
    public boolean process(ProductReadyToDelivery productReadyToDelivery) {
        System.out.println("Delivery from the Gluten-Free Shop is being processed.");
        Random random=new Random();
        return random.nextBoolean();
    }
}