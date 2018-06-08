package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductsReadyToDeliveryRetrieverHS implements ProductsReadyToDeliveryRetriever {
    @Override
    public ProductReadyToDelivery retrieve() {
        DeliveryCompany healthyShop=new DeliveryCompany("HealthyShop", "Rumia", "Wiejska 4", "81-263", new HealthyShopService());

        LocalDateTime productPreparationDate=LocalDateTime.now();

        return new ProductReadyToDelivery("Tomatos", 65, healthyShop, productPreparationDate);
    }

}
