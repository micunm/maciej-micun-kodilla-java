package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user=new User("Jasiu", "Fasola",
                "a@a", "krakow");

        LocalDateTime orderDate=LocalDateTime.now();
        OrderedProduct orderedProduct=new OrderedProduct(2, "toothbrush");

        return new OrderRequest(user, orderedProduct, orderDate);
    }

}
