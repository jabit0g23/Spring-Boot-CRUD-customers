package com.example.customers.services;

import com.example.customers.entities.Customers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServicesimp implements CustomerServices {

    private List<Customers> listC = new ArrayList<>();

    public CustomerServicesimp(){

        Customers c = new Customers();
        c.setId(1);
        c.setName("Javier");
        c.setLastname("Gonzalez");
        c.setAddress("asdasdasd");
        c.setEmail("asdasdasd");
        listC.add(c);

        Customers c2 = new Customers();
        c2.setId(2);
        c2.setName("Javier");
        c2.setLastname("Gonzalez");
        c2.setAddress("asdasdasd");
        c2.setEmail("asdasdasd");
        listC.add(c2);
    };

    public Customers getCustomer(Integer id){
        for (Customers customer : listC){
            if (customer.getId() == id){
                return  customer;
            }
        }
        return null;
    }

    public List<Customers> getAllCustomers(){
        return listC;
    }

    public void removeCustomer(Integer id){
        for (Customers customer : listC) {
            if (customer.getId() == id) {
                listC.remove(customer);
                break;
            }
        }
    }

    public void addCustomer(Customers customer){
        listC.add(customer);
    }

    public void updateCustomer(Integer id, Customers updateCustomer){
        for (Customers customer : listC) {
            if (customer.getId() == id) {
                listC.remove(customer);
                updateCustomer.setId(id);
                listC.add(updateCustomer);
                break;
            }
        }

    }

    public List<Customers> searchCustomer(String email, String name){

        List<Customers> searchResults = new ArrayList<>();

        if (email != null){
            for (Customers customer : listC) {
                if (customer.getEmail().contains(email)) {
                    searchResults.add(customer);
                }
            }
        }

        if (name != null) {
            for (Customers customer : listC) {
                if (customer.getName().contains(name)) {
                    searchResults.add(customer);
                }
            }
        }

        return searchResults;
    }

}
