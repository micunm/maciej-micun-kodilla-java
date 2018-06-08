package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductsReadyToDeliveryRetrieverGFS implements ProductsReadyToDeliveryRetriever{
    @Override
    public ProductReadyToDelivery retrieve() {
        DeliveryCompany glutenFreeShop=new DeliveryCompany("GlutenFreeShop", "Wejherowo", "Łąkowa 24", "83-212", new GlutenFreeShopService());
        LocalDateTime productPreparationDate=LocalDateTime.now();
        return new ProductReadyToDelivery("Avocado", 17, glutenFreeShop, productPreparationDate);
    }
}
