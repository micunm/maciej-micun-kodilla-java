package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductsReadyToDeliveryRetriever {
    public ProductReadyToDelivery retrieve() {
        DeliveryCompany deliveryComp=new DeliveryCompany("Jasiu", "Fasola",
                "a@a", "krakow");

        LocalDateTime orderDate=LocalDateTime.now();
        OrderedProduct orderedProduct=new OrderedProduct(2, "toothbrush");

        return new OrderRequest(user, orderedProduct, orderDate);
    }
}
