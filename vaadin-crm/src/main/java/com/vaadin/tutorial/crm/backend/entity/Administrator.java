package com.vaadin.tutorial.crm.backend.entity;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class Administrator extends UserEntity implements UserFunctionality {
    private final static String STATUS = "Administrator";
    //TODO: add logic to status
    // maybe check with switch and add to correct repository (or give access respectively)

    public Administrator(@NotNull @NotEmpty String username, @NotNull @NotEmpty String password, @Email @NotNull @NotEmpty String email) {
        super(username, password, email);
    }

    @Override
    public String getStatus() {
        return STATUS;
    }
}
