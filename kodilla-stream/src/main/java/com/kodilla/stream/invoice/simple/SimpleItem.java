package com.kodilla.stream.invoice.simple;

import java.util.Optional;

public class SimpleItem {
    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(final SimpleProduct product, final double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;
    }

    public SimpleProduct getProductNotNull() {
        Optional<SimpleProduct> sp=Optional.ofNullable(product);
        return sp.orElse(new SimpleProduct("no Product found", 0));

    }
}
