package com.kodilla.patterns2.fascade;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Order {
    private ProductService productService;
    private final List<Item> items=new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private boolean isPaid=false;
    private boolean isVerified=false;
    private boolean isSubmitted=false;
}

public BigDecimal calculate
