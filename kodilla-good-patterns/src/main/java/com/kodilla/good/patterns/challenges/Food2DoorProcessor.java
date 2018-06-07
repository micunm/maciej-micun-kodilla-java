package com.kodilla.good.patterns.challenges;

public class Food2DoorProcessor {
    private FoodDeliveryService foodDeliveryService;

    private Food2DoorInformationService deliveriesInformationService;

    public Food2DoorProcessor(FoodDeliveryService foodDeliveryService, Food2DoorInformationService deliveriesInformationService) {
        this.foodDeliveryService = foodDeliveryService;
        this.deliveriesInformationService = deliveriesInformationService;
    }
}
