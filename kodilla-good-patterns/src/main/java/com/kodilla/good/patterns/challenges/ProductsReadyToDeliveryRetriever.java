package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductsReadyToDeliveryRetriever {
    public ProductReadyToDelivery retrieve() {
        DeliveryCompany extraFoodShop=new DeliveryCompany("ExtraFoodShop", "Reda",
                "Polna 3", "84-240", ExtraFoodShopService extraFoodShopService);
        DeliveryCompany healthyShop=new DeliveryCompany("HealthyShop", "Rumia", "Wiejska 4", "81-263");
        DeliveryCompany glutenFreeShop=new DeliveryCompany("GlutenFreeShop", "Wejherowo", "Łąkowa 24", "83-212");

        LocalDateTime productPreparationDate=LocalDateTime.now();

        return new ProductReadyToDelivery("Watermelon", 12, extraFoodShop, productPreparationDate);
    }
}
