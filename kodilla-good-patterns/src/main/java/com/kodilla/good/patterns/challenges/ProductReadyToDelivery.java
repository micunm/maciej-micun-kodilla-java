package com.kodilla.good.patterns.challenges;

public class ProductReadyToDelivery {
    private int quantity;
    private String productName;

    public ProductReadyToDelivery (int quantity, String productName) {
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
