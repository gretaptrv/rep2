package com.vaadin.tutorial.crm.backend.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class SalesRepresentative extends UserEntity implements UserFunctionality {
    private static final String STATUS = "Sales Representative";
    @OneToMany
    private List<Client> clients;
    //TODO: add sales

    public SalesRepresentative(@NotNull @NotEmpty String username,
                               @NotNull @NotEmpty String password,
                               @Email @NotNull @NotEmpty String email) {
        super(username, password, email);
    }

    @Override
    public String getStatus() {
        return STATUS;
    }
}
