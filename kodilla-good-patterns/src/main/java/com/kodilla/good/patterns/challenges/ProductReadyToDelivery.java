package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductReadyToDelivery {
    private String productName;
    private int quantity;
    private DeliveryCompany deliveryCompany;
    private LocalDateTime productPreparationDate;

    public ProductReadyToDelivery (String productName, int quantity, DeliveryCompany deliveryCompany, LocalDateTime productPreparationDate) {
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

    public LocalDateTime getProductPreparationDate() {
        return productPreparationDate;
    }

    @Override
    public String toString() {
        return "ProductReadyToDelivery{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", deliveryCompany=" + deliveryCompany +
                ", productPreparationDate=" + productPreparationDate +
                '}';
    }
}
