package com.example.customers.entities;

import java.util.Objects;

public class Customers {

    private String name;
    private String lastname;
    private String email;
    private String address;

    public Customers(String name, String lastname, String email, String address) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return Objects.equals(name, customers.name) && Objects.equals(lastname, customers.lastname) && Objects.equals(email, customers.email) && Objects.equals(address, customers.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, email, address);
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
