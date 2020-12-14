package com.vaadin.tutorial.crm.backend.entity;


import javax.persistence.*;
import java.time.LocalDate;

public class Sale {
    @ManyToOne
    private SalesRepresentative saleRep;
    @ManyToOne
    private LocalDate date;
    @ManyToOne
    private Client client;
    private ProductBase product;

    public Sale(SalesRepresentative saleRep, LocalDate date, Client client, ProductBase product) {
        this.saleRep = saleRep;
        this.date = date;
        this.client = client;
        this.product = product;
    }

    public Sale(SalesRepresentative saleRep, Client client, ProductBase product) {
        this.saleRep = saleRep;
        this.date = LocalDate.now(); //when date is not entered
        this.client = client;
        this.product = product;
    }
}
