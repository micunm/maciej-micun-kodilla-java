package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private UserOrder userOrder;
    private LocalDateTime orderDate;

    public OrderRequest(User user, UserOrder userOrder, LocalDateTime orderDate) {
        this.user = user;
        this.userOrder = userOrder;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
