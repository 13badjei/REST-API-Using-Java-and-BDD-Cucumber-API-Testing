package com.api.project.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Benjamin Adjei on 14/12/2020
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    private String streetAddress;
    private float phone;
    private String email;
}
