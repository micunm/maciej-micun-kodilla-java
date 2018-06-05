package com.kodilla.good.patterns.challenges;

public class OrderedProduct {
    private int quantity;
    private String productName;

    public OrderedProduct(int quantity, String productName) {
        this.quantity = quantity;
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }
}
