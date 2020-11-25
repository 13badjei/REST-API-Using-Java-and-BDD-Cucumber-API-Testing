package com.api.project.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Benjamin Adjei on 23/11/20
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String streetAddress;
    private float phone;
    private String email;
}
