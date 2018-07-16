package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.Item;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {
    }

    @Id
    @GeneratedValue
    @Column(name="ID")
    public int getId() {
        return id;
    }

    @Column(name="NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            fetch=FetchType.LAZY
    )
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

