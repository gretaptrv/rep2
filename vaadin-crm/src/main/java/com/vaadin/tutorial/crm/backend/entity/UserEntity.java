package com.vaadin.tutorial.crm.backend.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //TODO: ask - meaning, probably change
    private Long id; //TODO: all to have id or not?
    @NotNull
    @NotEmpty
    private String username;
    @NotNull
    @NotEmpty
    private String password;
    @Email
    @NotNull
    @NotEmpty
    private String email;

    public UserEntity(@NotNull @NotEmpty String username,
                      @NotNull @NotEmpty String password,
                      @Email @NotNull @NotEmpty String email) {

            //TODO: validateMailAddress(email) [add regex exp]
            // validate other input
            this.username = username;
            this.password = password;
            this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
