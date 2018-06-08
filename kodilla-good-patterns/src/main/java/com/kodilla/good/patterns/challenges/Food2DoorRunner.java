package com.kodilla.good.patterns.challenges;

public class Food2DoorRunner {

    public static void main(String[] args) {
        ProductsReadyToDeliveryRetriever prtdr=new ProductsReadyToDeliveryRetriever();
        OrderRequestRetriever orr=new OrderRequestRetriever();
        ProductReadyToDelivery prtd=prtdr.retrieve();
        OrderRequest orderRequest=orr.retrieve();
        Food2DoorInformationService f2dis=new EmailInformationService();
        OrderInformationService ois=new SMSInformationService();

        ProductOrderService pos=new AllegroOrderService();
        OrdersRepository orep=new DatabaseRepository();
        ProductOrderProcessor pop=new ProductOrderProcessor(ois,pos,orep);

        boolean result = pop.processOrder(orderRequest);
        System.out.println("Order status: "+result);

    }
}
