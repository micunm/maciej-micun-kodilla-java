package com.kodilla.good.patterns.challenges;

public class Food2DoorProcessor {
    private FoodDeliveryService foodDeliveryService;

    private Food2DoorInformationService deliveriesInformationService;

    public Food2DoorProcessor(FoodDeliveryService foodDeliveryService, Food2DoorInformationService deliveriesInformationService) {
        this.foodDeliveryService = foodDeliveryService;
        this.deliveriesInformationService = deliveriesInformationService;
    }

    public boolean foodDeliveryProcess(ProductReadyToDelivery product2Deliver) {

        DeliveryCompany company=product2Deliver.getDeliveryCompany();
        boolean result=company.deliver(product2Deliver);

        if (result) {
            deliveriesInformationService.send("Delivery successfully processed");
            return true;
        } else {
            deliveriesInformationService.send("Delivery cannot be realized.");
            return false;
        }
    }
}
