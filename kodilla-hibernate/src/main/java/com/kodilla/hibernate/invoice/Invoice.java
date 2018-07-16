package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;

import java.util.List;

public class Invoice {
    private int id;
    private String number;
    private List<Item> items;

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

