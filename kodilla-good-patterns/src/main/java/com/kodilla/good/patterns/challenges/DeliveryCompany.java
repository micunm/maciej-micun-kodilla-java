package com.kodilla.good.patterns.challenges;

public class DeliveryCompany {
    private String companyName;
    private String city;
    private String street;
    private String postCode;
    private FoodDeliveryService foodDeliveryService;

    public DeliveryCompany(String companyName, String city, String street, String postCode, FoodDeliveryService foodDeliveryService) {
        this.companyName = companyName;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.foodDeliveryService = foodDeliveryService;
    }
    public boolean deliver (ProductReadyToDelivery productReadyToDelivery) {
        boolean result=foodDeliveryService.process(productReadyToDelivery);
        return result;
    }

}
