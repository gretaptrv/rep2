package com.vaadin.tutorial.crm.backend.entity;

import java.time.LocalDate;

public class Client {
    //TODO: extends UserFunc or  not check
    // TODO: 1)email, pass, username?  2)id?
    private String name;
    private SalesRepresentative saleRep;
    private Sale sale;

    public Client(String name, SalesRepresentative saleRep) {
        this.name = name;
        this.saleRep = saleRep;
    }

    public void buy(Sale sale) {
        if (sale != null) {
            this.sale = sale;
        }
        //TODO: add validations with exceptions
    }

}
