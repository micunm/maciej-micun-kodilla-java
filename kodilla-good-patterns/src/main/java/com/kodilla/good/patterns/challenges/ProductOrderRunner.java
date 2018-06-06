package com.kodilla.good.patterns.challenges;

public class ProductOrderRunner {
    public static void main(String[] args) {
        OrderRequestRetriever orr=new OrderRequestRetriever();
        OrderRequest orderRequest=orr.retrieve();
        OrderInformationService ois=new SMSInformationService();
        ProductOrderService pos=new AllegroOrderService();
        OrdersRepository orep=new DatabaseRepository();
        ProductOrderProcessor pop=new ProductOrderProcessor(ois,pos,orep);

        boolean result = pop.processOrder(orderRequest);
        System.out.println("Order status: "+result);

    }
}
