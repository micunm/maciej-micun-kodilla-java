package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private OrderedProduct orderedProduct;
    private LocalDateTime orderDate;

    public OrderRequest(User user, OrderedProduct orderedProduct, LocalDateTime orderDate) {
        this.user = user;
        this.orderedProduct = orderedProduct;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public OrderedProduct getOrderedProduct() {
        return orderedProduct;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
