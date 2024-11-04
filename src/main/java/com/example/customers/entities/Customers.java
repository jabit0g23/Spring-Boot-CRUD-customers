package com.example.customers.entities;

import lombok.*;

import java.util.Objects;

@Data
public class Customers {

    private Integer id;
    private String name;
    private String lastname;
    private String email;
    private String address;

}
