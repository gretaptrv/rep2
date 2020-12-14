package com.vaadin.tutorial.crm.backend.entity;

//TODO: add validations and throw exceptions

public class ProductBase {
    private String name;
    private double price;
    private int quantity;

    public ProductBase(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            return;
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            return;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
            return;
        }
    }

    public void reload(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
            return;
        }
    }
}
