package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductsReadyToDeliveryRetrieverEFSS implements ProductsReadyToDeliveryRetriever{
    @Override
    public ProductReadyToDelivery retrieve() {
        DeliveryCompany extraFoodShop=new DeliveryCompany("ExtraFoodShop", "Reda",
                "Polna 3", "84-240", new ExtraFoodShopService());

        LocalDateTime productPreparationDate=LocalDateTime.now();

        return new ProductReadyToDelivery("Watermelon", 12, extraFoodShop, productPreparationDate);
    }
}
