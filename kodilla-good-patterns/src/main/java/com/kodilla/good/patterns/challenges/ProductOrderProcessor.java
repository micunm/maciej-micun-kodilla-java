package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private OrderInformationService orderInformationService;
    private ProductOrderService productOrderService;
    private OrdersRepository ordersRepository;

    public ProductOrderProcessor(OrderInformationService orderInformationService, ProductOrderService productOrderService, OrdersRepository ordersRepository) {
        this.orderInformationService = orderInformationService;
        this.productOrderService = productOrderService;
        this.ordersRepository = ordersRepository;
    }

    public boolean processOrder (OrderRequest orderRequest) {
        ordersRepository.save(orderRequest);
        boolean result=productOrderService.process(orderRequest);

        if (result) {
            orderInformationService.send("Order successfully processed");
            return true;

        } else {
            orderInformationService.send("Can not process order");
            return false;
        }
    }

}
