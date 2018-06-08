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



 /*       boolean result=productOrderService.process(orderRequest);

        if (result) {
            orderInformationService.send("Order successfully processed");
            return true;

        } else {
            orderInformationService.send("Can not process order");
            return false;
        }
  */
    }
}
