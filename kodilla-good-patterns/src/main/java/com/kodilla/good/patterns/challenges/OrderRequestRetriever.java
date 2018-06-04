package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user=new User("Jasiu", "Fasola");

        LocalDateTime orderDate=LocalDateTime.now();
        UserOrder userOrder=new UserOrder();

        return new OrderRequest(user, userOrder, orderDate);
    }

}
