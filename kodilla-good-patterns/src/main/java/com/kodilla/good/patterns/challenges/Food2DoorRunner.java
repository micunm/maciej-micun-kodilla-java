package com.kodilla.good.patterns.challenges;

public class Food2DoorRunner {

    public static void main(String[] args) {

        Food2DoorInformationService f2dis=new EmailInformationService();

        //ExtraFoodShop service
        ProductsReadyToDeliveryRetriever prtdr1=new ProductsReadyToDeliveryRetrieverEFSS();
        ProductReadyToDelivery prtd1=prtdr1.retrieve();
        FoodDeliveryService fds=new ExtraFoodShopService();
        Food2DoorProcessor p2dp=new Food2DoorProcessor(fds,f2dis);
        boolean result = p2dp.foodDeliveryProcess(prtd1);
        System.out.println("Delivery realization status: "+result+"\n");

        //HealthyShop Service
        ProductsReadyToDeliveryRetriever prtdr2=new ProductsReadyToDeliveryRetrieverHS();
        ProductReadyToDelivery prtd2=prtdr2.retrieve();
        FoodDeliveryService fdsHS=new HealthyShopService();
        Food2DoorProcessor p2dpHS=new Food2DoorProcessor(fdsHS,f2dis);
        boolean result2 = p2dpHS.foodDeliveryProcess(prtd2);
        System.out.println("Delivery realization status: "+result2+"\n");

        //GlutenFreeShop Service
        ProductsReadyToDeliveryRetriever prtdr3=new ProductsReadyToDeliveryRetrieverGFS();
        ProductReadyToDelivery prtd3=prtdr3.retrieve();
        FoodDeliveryService fdsGFS=new GlutenFreeShopService();
        Food2DoorProcessor p2dpGFS=new Food2DoorProcessor(fdsGFS,f2dis);
        boolean result3 = p2dpGFS.foodDeliveryProcess(prtd3);
        System.out.println("Delivery realization status: "+result3+"\n");
    }
}
