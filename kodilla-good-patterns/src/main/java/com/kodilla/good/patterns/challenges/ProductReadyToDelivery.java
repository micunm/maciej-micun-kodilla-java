package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductReadyToDelivery {
    private String productName;
    private int quantity;
    private DeliveryCompany deliveryCompany;
    private LocalDate productPreparationDate;

    public ProductReadyToDelivery (String productName, int quantity, DeliveryCompany deliveryCompany, LocalDate productPreparationDate) {
        this.quantity = quantity;
        this.productName = productName;
        this.deliveryCompany=deliveryCompany;
        this.productPreparationDate=productPreparationDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public DeliveryCompany getDeliveryCompany() {
        return deliveryCompany;
    }

    public LocalDate getProductPreparationDate() {
        return productPreparationDate;
    }
}
